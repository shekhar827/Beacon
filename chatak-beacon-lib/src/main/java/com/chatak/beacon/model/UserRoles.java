package com.chatak.beacon.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserRoles implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private Long USER_ROLE_ID;

  private String NAME;

  private String DESCRIPTION;

  private String STATUS;

  private Timestamp CREATED_DATE;

  private String ROLE_TYPE;

  private String MAKER_CHECKER_REQ;

  private String CREATED_BY;

  private String UPDATED_BY;

  // String array associate service provider names with user role
  private String[] availability;

  private String avilabilityData;

  private String REASON;

  /**
   * @return the uSER_ROLE_ID
   */
  public Long getUSER_ROLE_ID() {
    return USER_ROLE_ID;
  }

  /**
   * @param uSER_ROLE_ID
   *          the uSER_ROLE_ID to set
   */
  public void setUSER_ROLE_ID(Long uSER_ROLE_ID) {
    USER_ROLE_ID = uSER_ROLE_ID;
  }

  /**
   * @return the nAME
   */
  public String getNAME() {
    return NAME;
  }

  /**
   * @param nAME
   *          the nAME to set
   */
  public void setNAME(String nAME) {
    NAME = nAME;
  }

  /**
   * @return the dESCRIPTION
   */
  public String getDESCRIPTION() {
    return DESCRIPTION;
  }

  /**
   * @param dESCRIPTION
   *          the dESCRIPTION to set
   */
  public void setDESCRIPTION(String dESCRIPTION) {
    DESCRIPTION = dESCRIPTION;
  }

  /**
   * @return the sTATUS
   */
  public String getSTATUS() {
    return STATUS;
  }

  /**
   * @param sTATUS
   *          the sTATUS to set
   */
  public void setSTATUS(String sTATUS) {
    STATUS = sTATUS;
  }

  /**
   * @return the cREATED_DATE
   */
  public Timestamp getCREATED_DATE() {
    return CREATED_DATE;
  }

  /**
   * @param cREATED_DATE
   *          the cREATED_DATE to set
   */
  public void setCREATED_DATE(Timestamp cREATED_DATE) {
    CREATED_DATE = cREATED_DATE;
  }

  /**
   * @return the ROLE_TYPE
   */
  public String getROLE_TYPE() {
    return ROLE_TYPE;
  }

/**
   * @param ROLE_TYPE
   *          the rOLE_TYPE to set
   */
  public void setROLE_TYPE(String rOLE_TYPE) {
		ROLE_TYPE = rOLE_TYPE;
  } 

  /**
   * @return the mAKER_CHECKER_REQ
   */
  public String getMAKER_CHECKER_REQ() {
    return MAKER_CHECKER_REQ;
  }

  /**
   * @param mAKER_CHECKER_REQ
   *          the mAKER_CHECKER_REQ to set
   */
  public void setMAKER_CHECKER_REQ(String mAKER_CHECKER_REQ) {
    MAKER_CHECKER_REQ = mAKER_CHECKER_REQ;
  }

  /**
   * @return the availability
   */
  public String[] getAvailability() {
    return availability;
  }

  /**
   * @param availability
   *          the availability to set
   */
  public void setAvailability(String[] availability) {
    this.availability = availability;
  }

  /**
   * @return the avilabilityData
   */
  public String getAvilabilityData() {
    return avilabilityData;
  }

  /**
   * @param avilabilityData
   *          the avilabilityData to set
   */
  public void setAvilabilityData(String avilabilityData) {
    this.avilabilityData = avilabilityData;
  }

  /**
 

  /**
   * @return the rEASON
   */
  public String getREASON() {
    return REASON;
  }

  /**
 * @return the cREATED_BY
 */
public String getCREATED_BY() {
	return CREATED_BY;
}

/**
 * @param cREATED_BY the cREATED_BY to set
 */
public void setCREATED_BY(String cREATED_BY) {
	CREATED_BY = cREATED_BY;
}

/**
 * @return the uPDATED_BY
 */
public String getUPDATED_BY() {
	return UPDATED_BY;
}

/**
 * @param uPDATED_BY the uPDATED_BY to set
 */
public void setUPDATED_BY(String uPDATED_BY) {
	UPDATED_BY = uPDATED_BY;
}

/**
   * @param rEASON
   *          the rEASON to set
   */
  public void setREASON(String rEASON) {
    REASON = rEASON;
  }
}
