/**
 * 
 */
package com.chatak.beacon.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * << Add Comments Here >>
 * 
 * @author Girmiti Software
 * @date 08-Jan-2015 12:00:44 AM
 * @version 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Option {
  
  private String value;

  private String label;

  /**
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * @param value
   *          the value to set
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * @return the label
   */
  public String getLabel() {
    return label;
  }

  /**
   * @param label
   *          the label to set
   */
  public void setLabel(String label) {
    this.label = label;
  }

}
