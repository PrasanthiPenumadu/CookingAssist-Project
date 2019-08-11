package com.arar.recipe.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .withUser("pra").password("{noop}pra123").roles("ADMIN", "USER").and()
        .withUser("santhi").password("{noop}santhi123").roles("USER");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin()
          .successHandler(new LoginSuccessHandler()).and()
        .authorizeRequests()
          .antMatchers(HttpMethod.POST, "/recipes/**").hasRole("ADMIN")
          .antMatchers(HttpMethod.PUT, "/recipes/**").hasRole("ADMIN");

  }
}
