package com.chatak.beacon.model;

import java.util.List;

public class UserRoleResponse extends Response {

	private static final long serialVersionUID = 1972368145369229331L;
	
	private List<UserRoleRequest> userRoleRequests;

	/**
	 * @return the userRoleRequests
	 */
	public List<UserRoleRequest> getUserRoleRequests() {
		return userRoleRequests;
	}

	/**
	 * @param userRoleRequests the userRoleRequests to set
	 */
	public void setUserRoleRequests(List<UserRoleRequest> userRoleRequests) {
		this.userRoleRequests = userRoleRequests;
	}
	
	
}
