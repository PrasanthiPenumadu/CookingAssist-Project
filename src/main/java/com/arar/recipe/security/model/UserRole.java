package com.arar.recipe.security.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum UserRole {
  ADMIN(new SimpleGrantedAuthority("ROLE_ADMIN")),
  USER(new SimpleGrantedAuthority("ROLE_USER"));

  private SimpleGrantedAuthority simpleGrantedAuthority;

  UserRole(SimpleGrantedAuthority simpleGrantedAuthority) {
    this.simpleGrantedAuthority = simpleGrantedAuthority;
  }

  public SimpleGrantedAuthority getSimpleGrantedAuthority() {
    return simpleGrantedAuthority;
  }
}

