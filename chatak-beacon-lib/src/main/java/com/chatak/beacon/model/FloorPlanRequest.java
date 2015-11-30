package com.chatak.beacon.model;


public class FloorPlanRequest extends SearchRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String floorPlanName;
	
	private Long zoneId;
	
	private String zoneName;
	
	private Double width;
	
	private Double length;
	
	private Double height;
	
	private String upperLeftXY;
	
	private String upperRightXY;
	
	private String lowerLeftXY;
	
	private String lowerRightXY;
	
	private byte[] image;
	
	private String status;
	
	private String reason;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the floorPlanName
	 */
	public String getFloorPlanName() {
		return floorPlanName;
	}

	/**
	 * @param floorPlanName the floorPlanName to set
	 */
	public void setFloorPlanName(String floorPlanName) {
		this.floorPlanName = floorPlanName;
	}

	/**
	 * @return the zoneId
	 */
	public Long getZoneId() {
		return zoneId;
	}

	/**
	 * @param zoneId the zoneId to set
	 */
	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
	}

	/**
	 * @return the zoneName
	 */
	public String getZoneName() {
		return zoneName;
	}

	/**
	 * @param zoneName the zoneName to set
	 */
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	/**
	 * @return the width
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public Double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Double length) {
		this.length = length;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(Double height) {
		this.height = height;
	}

	/**
	 * @return the upperLeftXY
	 */
	public String getUpperLeftXY() {
		return upperLeftXY;
	}

	/**
	 * @param upperLeftXY the upperLeftXY to set
	 */
	public void setUpperLeftXY(String upperLeftXY) {
		this.upperLeftXY = upperLeftXY;
	}

	/**
	 * @return the upperRightXY
	 */
	public String getUpperRightXY() {
		return upperRightXY;
	}

	/**
	 * @param upperRightXY the upperRightXY to set
	 */
	public void setUpperRightXY(String upperRightXY) {
		this.upperRightXY = upperRightXY;
	}

	/**
	 * @return the lowerLeftXY
	 */
	public String getLowerLeftXY() {
		return lowerLeftXY;
	}

	/**
	 * @param lowerLeftXY the lowerLeftXY to set
	 */
	public void setLowerLeftXY(String lowerLeftXY) {
		this.lowerLeftXY = lowerLeftXY;
	}

	/**
	 * @return the lowerRightXY
	 */
	public String getLowerRightXY() {
		return lowerRightXY;
	}

	/**
	 * @param lowerRightXY the lowerRightXY to set
	 */
	public void setLowerRightXY(String lowerRightXY) {
		this.lowerRightXY = lowerRightXY;
	}

	/**
	 * @return the image
	 */
	public byte[] getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(byte[] image) {
		this.image = image;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
}
