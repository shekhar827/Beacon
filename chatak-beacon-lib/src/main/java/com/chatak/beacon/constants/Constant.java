package com.chatak.beacon.constants;

/**
 * << Add Comments Here >>
 * 
 * @author Girmiti Software
 * @date 30-Mar-2015 11:25:59 AM
 * @version 1.0
 */
public interface Constant {

  public static final String REQUESTOR_MODEL = "requestor";

  public static final String BIN_REGISTRATION_MODEL = "binRegistrationDTO";

  public static final String ISSUER_MODEL = "tokenIssuer";

  public static final String TOKEN_MGNT_MODEL = "tokenManagement";

  public static final String COUNTRY_LIST = "countryList";

  public static final String STATE_LIST = "stateList";

  public static final String MODEL_ATTRIBUTE_ENTITY_LIST_PAGE_NUMBER = "entityListPageNumber";

  public static final String MODEL_ATTRIBUTE_ENTITY_LIST_BEGIN_PAGE_NUM = "beginEntityPage";

  public static final String MODEL_ATTRIBUTE_ENTITY_LIST_END_PAGE_NUM = "endEntityPage";

  public static final Integer MAX_ENTITIES_PAGINATION_DISPLAY_SIZE = 10;

  public static final Integer MAX_ENTITY_DISPLAY_SIZE = 10;

  public static final String MODEL_ATTRIBUTE_PORTAL_LIST_PAGE_NUMBER = "portalListPageNumber";

  public static final String MODEL_ATTRIBUTE_PORTAL_LIST_BEGIN_PAGE_NUM = "beginPortalPage";

  public static final String MODEL_ATTRIBUTE_PORTAL_LIST_END_PAGE_NUM = "endPortalPage";

  public static final String PORTAL_PAGES_SESSION_NAME = "portalPages";

  public static final String MODEL_ATTRIBUTE_PORTAL_TOTAL_RECORDS_PAGE_NUM = "totalRecords";

  public static final Integer MAX_ENTITIES_PORTAL_DISPLAY_SIZE = 4;

  public static final String PDF_FILE_FORMAT = "PDF";

  public static final String XLS_FILE_FORMAT = "XLS";

  public static final String EXPORT_FILE_NAME_DATE_FORMAT = "MM/dd/yyyy";

  public static final String EXPORT_HEADER_DATE_FORMAT = "";

  public static final String ERROR = "genralerror";

  public static final String SUCESS = "Success";

  public static final String SUCCESS_CODE = "00";

  public static final String ERROR_CODE = "99";

  public static final String ACTIVE = "Active";

  public static final String DE_ACTIVE = "De-Active";

  public static final Integer ONE = 1;

  public static final Integer TWO = 2;

  public static final Integer THREE = 3;

  public static final Integer FOUR = 4;

  public static final Integer FIVE = 5;

  public static final Integer SIX = 6;

  public static final Integer SEVEN = 7;

  public static final Integer EIGHT = 8;

  public static final Integer NINE = 9;

  public static final String FAILURE = "Failure";

  public static final Integer DEFAULT_PAGE_SIZE = 50;

  public static final String SUSPEND = "Suspended";

  public static final String DISABLED = "Disabled";

  public static final String REGX_CARD_EXPIRY = "(?:0[1-9]|1[0-2])/[0-9]{2}";

  public static final String REGX_BIN_RANGE = "\\d{4,6}([\\,][\\d{4,6}])?";

  public static final String DELETED = "Deleted";

  public static final String TOKEN_EXP_DATE_FORMAT = "dd-MM-yy";

  public static final String VERSION_NUM = "^[\\d]\\.\\d";

  public static final String OTP_SENT = "OTP_SENT";

  public static final String OTP_AUTHENTICATED = "OTP_AUTHENTICATED";

  public static final Integer ZERO = 0;

  public static final String ISSUER_SUCESS_CODE = "CEC_0001";

  public static final Integer PASS_RETRY_COUNT = 3;

  public static final String TEMPLATE_PATH = "/EmailTemplate/";

  public static final String CREATE_ADMIN_FORGOT_PASSWORD_TEMPLATE = TEMPLATE_PATH + "admin_forgot_password.vm";

  public static final String Yes = "yes";

  public static final String No = "no";

  public static final String WALLET_MODEL = "walletManagementModel";

  public static final String LOING_USER_ID = "loginUserId";

  public static final String PASSWORD = "password";

  public static final Integer PASS_EXPIRE_DAYS = 90;

  public static final String CREATE_OTP_EMAIL = TEMPLATE_PATH + "OTP_email.vm";
  
  public static final String HEX_PATTERN = "[0-9A-Fa-f]+$";
  
  public static final String SP_TSM = "Sp-Tsm";
  
  public static final String EMAIL_TOKEN_SET_NEW_PASSWORD = "SET_NEW_PASSWORD";
  
  public static final String EMPTY = "EMPTY";
  
  public static final Long LONG_ZERO =(long) 0;
  
  public static final String CREATE_ADMIN_USER_TEMPLATE = TEMPLATE_PATH + "user_create.vm";
  
  public static final String USER_SATATUS_CHANGE = TEMPLATE_PATH + "user_status_change.vm";
  
  public static final String CREATED_BY = "Admin";
  
  public static final String COOKIE_BEACON_NAME = "BEACON_ID";
  
  public static final String SUCCESS = "success";
  
  public static final String ZONE_MANAGEMENT_REQUEST = "zoneManagementRequest";
  
  public static final String BEACON_LOCATION_MAP_REQUEST = "beaconLocationMapRequest";
  
  public static final String BEACON_REQUEST = "beaconRequest";

  public static final String UPDATE_ADMIN_USER_TEMPLATE = TEMPLATE_PATH + "user_update.vm";	
  
  public static final String BEACON = "Beacon";
  
  public static final String SYSTEM = "System";
  
  public static final String ADMIN_USER_DATA = "adminUserData";
  
  public static final String LOGIN_RESPONSE_DATA = "loginResponse";
  
  public static final String LOCATION_REQUEST_DATA = "locationRequestData";
  
  public static final String EXISTING_FEATURES = "existingFeatures";
  
  public static final String SUSPENDED = "Suspended";

public static final String EXISTING_FEATURE_DATA = "existingFeatureData";
  
  public static final String CREATE = "Create";
  
  public static final String UPDATE = "Update";

public static final Object NO = "no";
  
}