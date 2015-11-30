package com.chatak.beacon.model;

import java.util.List;

public class LocationResponse extends Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1783283239826440226L;

	private List<LocationRequest> locationRequests;

	/**
	 * @return the locationRequests
	 */
	public List<LocationRequest> getLocationRequests() {
		return locationRequests;
	}

	/**
	 * @param locationRequests the locationRequests to set
	 */
	public void setLocationRequests(List<LocationRequest> locationRequests) {
		this.locationRequests = locationRequests;
	}
}
