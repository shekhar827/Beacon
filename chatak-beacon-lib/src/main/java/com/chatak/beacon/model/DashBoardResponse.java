package com.chatak.beacon.model;

public class DashBoardResponse extends Response {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8233744538803036733L;

	private Long tokenCount;
	
	private Long deTokenizationCount;
	
	private Long schemeCount;
	
	private Long cardDownloadCount;
	
	private Long replenishCount;
	
	private Long walletRegistrationCount;
	
	private Long activeWalletCount;
	
	private Long inActiveWalletCount;

	/**
	 * @return the tokenCount
	 */
	public Long getTokenCount() {
		return tokenCount;
	}

	/**
	 * @param tokenCount the tokenCount to set
	 */
	public void setTokenCount(Long tokenCount) {
		this.tokenCount = tokenCount;
	}

	/**
	 * @return the deTokenizationCount
	 */
	public Long getDeTokenizationCount() {
		return deTokenizationCount;
	}

	/**
	 * @param deTokenizationCount the deTokenizationCount to set
	 */
	public void setDeTokenizationCount(Long deTokenizationCount) {
		this.deTokenizationCount = deTokenizationCount;
	}

	/**
	 * @return the schemeCount
	 */
	public Long getSchemeCount() {
		return schemeCount;
	}

	/**
	 * @param schemeCount the schemeCount to set
	 */
	public void setSchemeCount(Long schemeCount) {
		this.schemeCount = schemeCount;
	}

	/**
	 * @return the cardDownloadCount
	 */
	public Long getCardDownloadCount() {
		return cardDownloadCount;
	}

	/**
	 * @param cardDownloadCount the cardDownloadCount to set
	 */
	public void setCardDownloadCount(Long cardDownloadCount) {
		this.cardDownloadCount = cardDownloadCount;
	}

	/**
	 * @return the replenishCount
	 */
	public Long getReplenishCount() {
		return replenishCount;
	}

	/**
	 * @param replenishCount the replenishCount to set
	 */
	public void setReplenishCount(Long replenishCount) {
		this.replenishCount = replenishCount;
	}

	/**
	 * @return the walletRegistrationCount
	 */
	public Long getWalletRegistrationCount() {
		return walletRegistrationCount;
	}

	/**
	 * @param walletRegistrationCount the walletRegistrationCount to set
	 */
	public void setWalletRegistrationCount(Long walletRegistrationCount) {
		this.walletRegistrationCount = walletRegistrationCount;
	}

	/**
	 * @return the activeWalletCount
	 */
	public Long getActiveWalletCount() {
		return activeWalletCount;
	}

	/**
	 * @param activeWalletCount the activeWalletCount to set
	 */
	public void setActiveWalletCount(Long activeWalletCount) {
		this.activeWalletCount = activeWalletCount;
	}

	/**
	 * @return the inActiveWalletCount
	 */
	public Long getInActiveWalletCount() {
		return inActiveWalletCount;
	}

	/**
	 * @param inActiveWalletCount the inActiveWalletCount to set
	 */
	public void setInActiveWalletCount(Long inActiveWalletCount) {
		this.inActiveWalletCount = inActiveWalletCount;
	}
}
