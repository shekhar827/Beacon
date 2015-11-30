package com.chatak.beacon.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleFeatureResponse extends Response {
  /**
   * 
   */
  private static final long serialVersionUID = 6650878003348604663L;

  public List<BeaconFeatureRequest> featureList;

  /**
   * @return the featureList
   */
  public List<BeaconFeatureRequest> getFeatureList() {
    return featureList;
  }

  /**
   * @param featureList
   *          the featureList to set
   */
  public void setFeatureList(List<BeaconFeatureRequest> featureList) {
    this.featureList = featureList;
  }

}
