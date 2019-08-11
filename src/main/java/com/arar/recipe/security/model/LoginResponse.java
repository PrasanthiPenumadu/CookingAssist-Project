package com.arar.recipe.security.model;

import java.util.List;

public class LoginResponse {
  private List<UserRole> userRoles;

  public LoginResponse() {
  }

  public LoginResponse(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }

  public List<UserRole> getUserRoles() {
    return userRoles;
  }

  public void setUserRoles(List<UserRole> userRoles) {
    this.userRoles = userRoles;
  }
}
