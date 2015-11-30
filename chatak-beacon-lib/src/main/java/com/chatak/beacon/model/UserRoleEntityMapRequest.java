package com.chatak.beacon.model;


public class UserRoleEntityMapRequest extends SearchRequest {

	private static final long serialVersionUID = 2608094827124494228L;

	private Long id;

	private Long userRoleId;

	private Long tokenId;
	
	private Long hceId;
	
	private Long sptsmId;

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
	 * @return the userRoleId
	 */
	public Long getUserRoleId() {
		return userRoleId;
	}

	/**
	 * @param userRoleId the userRoleId to set
	 */
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	/**
	 * @return the tokenId
	 */
	public Long getTokenId() {
		return tokenId;
	}

	/**
	 * @param tokenId the tokenId to set
	 */
	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}

	/**
	 * @return the hceId
	 */
	public Long getHceId() {
		return hceId;
	}

	/**
	 * @param hceId the hceId to set
	 */
	public void setHceId(Long hceId) {
		this.hceId = hceId;
	}

	/**
	 * @return the sptsmId
	 */
	public Long getSptsmId() {
		return sptsmId;
	}

	/**
	 * @param sptsmId the sptsmId to set
	 */
	public void setSptsmId(Long sptsmId) {
		this.sptsmId = sptsmId;
	}

	
	
	
}
