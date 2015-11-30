/**
 * 
 */
package com.chatak.beacon.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * REST API model class to hold Login Request
 * 
 * @author Girmiti Software
 * @date 03-Jan-2015 10:49:43 AM
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginRequest implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 2008207112284994849L;

  private String spUser;

  private String spPass;

  private String jSession;

  /**
   * @return the spUser
   */
  public String getSpUser() {
    return spUser;
  }

  /**
   * @param spUser the spUser to set
   */
  public void setSpUser(String spUser) {
    this.spUser = spUser;
  }

  /**
   * @return the spPass
   */
  public String getSpPass() {
    return spPass;
  }

  /**
   * @param spPass the spPass to set
   */
  public void setSpPass(String spPass) {
    this.spPass = spPass;
  }

  /**
   * @return the jSession
   */
  public String getjSession() {
    return jSession;
  }

  /**
   * @param jSession the jSession to set
   */
  public void setjSession(String jSession) {
    this.jSession = jSession;
  }


}
