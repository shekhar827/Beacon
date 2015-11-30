package com.chatak.beacon.model;

import java.sql.Timestamp;
import java.util.List;

import com.chatak.beacon.enums.RoleLevel;

public class AdminUserRequest extends SearchRequest  {

	private static final long serialVersionUID = 8646757906146733339L;

	  private Long adminUserId;  
	
	  private String userType;

	  private Long roleId;

	  private String userName;
	  
	  private Long bankId;

	  private String bankName;
	  
	  private String roleStatus;

	  private String subServiceProviderId;
	  
	  private String firstName;

	  private String reason;

	  private String lastName;

	  private String phone;

	  private String email;

	  private String addr1;

	  private String addr2;

	  private String zip;

	  private String city;

	  private String state;

	  private String country;

	  private String status;

	  private Long userId;
	  
	  private String roleName;
	  
	  private Long partnerId;
	  
	  private String partnerName;
	  
	  private Long userRoleId;
	  
	  private String emailToken;
	  
	  private String password;
	  
	  private String statusChangeFlage;
	  
	  private String previousEmailId;
	  
	  private Long programManagerId;
	  
	  private String programManagerName;
	  
	  private Long salesAgentId; 
		 
	  private String salesAgentName;
	 
	  private Long entityId;
	 
	  private List<String> useTypeIn;
	 
	  private Integer recordPerPage;
	  
      private String securityQuestion;
	  
	  private String securityAnswer;
	  
	  private Timestamp lastPassWordChange;
	  
	  private RoleLevel roleLevelList;
	  
	  public Integer getRecordPerPage() {
		  return recordPerPage;
	  }

	  public void setRecordPerPage(Integer recordPerPage) {
		  this.recordPerPage = recordPerPage;
	  }

	/**
	 * @return the useTypeIn
	 */
	public List<String> getUseTypeIn() {
		return useTypeIn;
	}

	/**
	 * @param useTypeIn the useTypeIn to set
	 */
	public void setUseTypeIn(List<String> useTypeIn) {
		this.useTypeIn = useTypeIn;
	}

	/**
	 * @return the entityId
	 */
	public Long getEntityId() {
		return entityId;
	}

	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the bankId
	 */
	public Long getBankId() {
		return bankId;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @return the roleStatus
	 */
	public String getRoleStatus() {
		return roleStatus;
	}

	/**
	 * @return the subServiceProviderId
	 */
	public String getSubServiceProviderId() {
		return subServiceProviderId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the addr1
	 */
	public String getAddr1() {
		return addr1;
	}

	/**
	 * @return the addr2
	 */
	public String getAddr2() {
		return addr2;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @return the partnerId
	 */
	public Long getPartnerId() {
		return partnerId;
	}

	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * @return the userRoleId
	 */
	public Long getUserRoleId() {
		return userRoleId;
	}

	/**
	 * @return the emailToken
	 */
	public String getEmailToken() {
		return emailToken;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the statusChangeFlage
	 */
	public String getStatusChangeFlage() {
		return statusChangeFlage;
	}

	/**
	 * @return the previousEmailId
	 */
	public String getPreviousEmailId() {
		return previousEmailId;
	}

	/**
	 * @return the programManagerId
	 */
	public Long getProgramManagerId() {
		return programManagerId;
	}

	/**
	 * @return the salesAgentId
	 */
	public Long getSalesAgentId() {
		return salesAgentId;
	}

	/**
	 * @return the salesAgentName
	 */
	public String getSalesAgentName() {
		return salesAgentName;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @param roleStatus the roleStatus to set
	 */
	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}

	/**
	 * @param subServiceProviderId the subServiceProviderId to set
	 */
	public void setSubServiceProviderId(String subServiceProviderId) {
		this.subServiceProviderId = subServiceProviderId;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param addr1 the addr1 to set
	 */
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	/**
	 * @param addr2 the addr2 to set
	 */
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	/**
	 * @param partnerName the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * @param userRoleId the userRoleId to set
	 */
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 * @param emailToken the emailToken to set
	 */
	public void setEmailToken(String emailToken) {
		this.emailToken = emailToken;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param statusChangeFlage the statusChangeFlage to set
	 */
	public void setStatusChangeFlage(String statusChangeFlage) {
		this.statusChangeFlage = statusChangeFlage;
	}

	/**
	 * @param previousEmailId the previousEmailId to set
	 */
	public void setPreviousEmailId(String previousEmailId) {
		this.previousEmailId = previousEmailId;
	}

	/**
	 * @param programManagerId the programManagerId to set
	 */
	public void setProgramManagerId(Long programManagerId) {
		this.programManagerId = programManagerId;
	}

	/**
	 * @param salesAgentId the salesAgentId to set
	 */
	public void setSalesAgentId(Long salesAgentId) {
		this.salesAgentId = salesAgentId;
	}

	/**
	 * @param salesAgentName the salesAgentName to set
	 */
	public void setSalesAgentName(String salesAgentName) {
		this.salesAgentName = salesAgentName;
	}

	/**
	 * @return the programManagerName
	 */
	public String getProgramManagerName() {
		return programManagerName;
	}

	/**
	 * @param programManagerName the programManagerName to set
	 */
	public void setProgramManagerName(String programManagerName) {
		this.programManagerName = programManagerName;
	}

	/**
	 * @return the adminUserId
	 */
	public Long getAdminUserId() {
		return adminUserId;
	}

	/**
	 * @param adminUserId the adminUserId to set
	 */
	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the securityQuestion
	 */
	public String getSecurityQuestion() {
		return securityQuestion;
	}

	/**
	 * @param securityQuestion the securityQuestion to set
	 */
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	/**
	 * @return the securityAnswer
	 */
	public String getSecurityAnswer() {
		return securityAnswer;
	}

	/**
	 * @param securityAnswer the securityAnswer to set
	 */
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	/**
	 * @return the lastPassWordChange
	 */
	public Timestamp getLastPassWordChange() {
		return lastPassWordChange;
	}

	/**
	 * @param lastPassWordChange the lastPassWordChange to set
	 */
	public void setLastPassWordChange(Timestamp lastPassWordChange) {
		this.lastPassWordChange = lastPassWordChange;
	}

	/**
	 * @return the roleLevelList
	 */
	public RoleLevel getRoleLevelList() {
		return roleLevelList;
	}

	/**
	 * @param roleLevelList the roleLevelList to set
	 */
	public void setRoleLevelList(RoleLevel roleLevelList) {
		this.roleLevelList = roleLevelList;
	}

}
