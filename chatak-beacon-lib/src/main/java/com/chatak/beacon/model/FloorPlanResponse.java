package com.chatak.beacon.model;

import java.util.List;

public class FloorPlanResponse extends Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3964956035658836175L;

	private List<FloorPlanRequest> floorPlanRequests;

	/**
	 * @return the floorPlanRequests
	 */
	public List<FloorPlanRequest> getFloorPlanRequests() {
		return floorPlanRequests;
	}

	/**
	 * @param floorPlanRequests the floorPlanRequests to set
	 */
	public void setFloorPlanRequests(List<FloorPlanRequest> floorPlanRequests) {
		this.floorPlanRequests = floorPlanRequests;
	}
}
