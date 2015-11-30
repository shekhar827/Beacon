package com.chatak.beacon.model;

import java.util.List;

public class LoginSessionDetailsResponse extends Response {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1146715907092064047L;
	private List<LoginSessionDetailsRequest> loginSessionDetailsRequest;

	/**
	 * @return the loginSessionDetailsRequest
	 */
	public List<LoginSessionDetailsRequest> getLoginSessionDetailsRequest() {
		return loginSessionDetailsRequest;
	}

	/**
	 * @param loginSessionDetailsRequest the loginSessionDetailsRequest to set
	 */
	public void setLoginSessionDetailsRequest(
			List<LoginSessionDetailsRequest> loginSessionDetailsRequest) {
		this.loginSessionDetailsRequest = loginSessionDetailsRequest;
	}
	

	
	
}
