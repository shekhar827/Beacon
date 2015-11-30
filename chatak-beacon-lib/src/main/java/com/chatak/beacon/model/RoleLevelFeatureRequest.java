package com.chatak.beacon.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.chatak.beacon.enums.RoleLevel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleLevelFeatureRequest extends Request {
  /**
   * 
   */
  private static final long serialVersionUID = -7109310718790126930L;
  RoleLevel roleLevel;

  /**
   * @return the roleLevel
   */
  public RoleLevel getRoleLevel() {
    return roleLevel;
  }

  /**
   * @param roleLevel
   *          the roleLevel to set
   */
  public void setRoleLevel(RoleLevel roleLevel) {
    this.roleLevel = roleLevel;
  }

}
