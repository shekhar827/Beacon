/**
 * 
 */
package com.chatak.beacon.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeAdminPasswordRequest extends Request {

	/**
   * 
   */
	private static final long serialVersionUID = 5883429528010800560L;

	private String oldPass;

	private String newPass;

	private String adminUserId;
	
	private String userName;
	
    private String securityQuestion;
	
	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	private String securityAnswer;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the adminUserId
	 */
	public String getAdminUserId() {
		return adminUserId;
	}

	/**
	 * @param adminUserId the adminUserId to set
	 */
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}

	/**
	 * @return the oldPass
	 */
	public String getOldPass() {
		return oldPass;
	}

	/**
	 * @param oldPass the oldPass to set
	 */
	public void setOldPass(String oldPass) {
		this.oldPass = oldPass;
	}

	/**
	 * @return the newPass
	 */
	public String getNewPass() {
		return newPass;
	}

	/**
	 * @param newPass the newPass to set
	 */
	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	
	

}
