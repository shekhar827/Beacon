package com.chatak.beacon.model;

/**
 * This class represents the State request
 * 
 * @author Girmiti Software
 * @date 10-Apr-2015 11:59:20 AM
 * @version 1.0
 */
public class StateRequest extends SearchRequest {


  /**
   * 
   */
  private static final long serialVersionUID = 1044295682878604120L;

  private Long id;

  private Long countryId;

  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCountryId() {
    return countryId;
  }

  public void setCountryId(Long countryId) {
    this.countryId = countryId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("StateRequest{");
    sb.append("[id:" + id + "],");
    sb.append("[countryId:" + countryId + "],");
    sb.append("[name:" + name + "]");
    sb.append("}");
    return sb.toString();
  }
}
