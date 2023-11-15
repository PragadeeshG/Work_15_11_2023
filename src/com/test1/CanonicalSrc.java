package com.test1;

public class CanonicalSrc {
	private String countryCode;
	private String rtngMeta;
	private String src;
	private String rtdRoutingControl;
	private String premiumPayment;
	private boolean automaticSource;
	private String automaticSrcIndicator;
	private String manualSource;
	private String manualSourceIndicator;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CanonicalSrc() {

	}

	public CanonicalSrc(String countryCode, String rtngMeta, String src, String rtdRoutingControl,
			String premiumPayment, boolean automaticSource, String automaticSrcIndicator, String manualSource,
			String manualSourceIndicator, String creationCr, String modifiedCr, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.rtngMeta = rtngMeta;
		this.src = src;
		this.rtdRoutingControl = rtdRoutingControl;
		this.premiumPayment = premiumPayment;
		this.automaticSource = automaticSource;
		this.automaticSrcIndicator = automaticSrcIndicator;
		this.manualSource = manualSource;
		this.manualSourceIndicator = manualSourceIndicator;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRtngMeta() {
		return rtngMeta;
	}

	public void setRtngMeta(String rtngMeta) {
		this.rtngMeta = rtngMeta;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getRtdRoutingControl() {
		return rtdRoutingControl;
	}

	public void setRtdRoutingControl(String rtdRoutingControl) {
		this.rtdRoutingControl = rtdRoutingControl;
	}

	public String getPremiumPayment() {
		return premiumPayment;
	}

	public void setPremiumPayment(String premiumPayment) {
		this.premiumPayment = premiumPayment;
	}

	public boolean isAutomaticSource() {
		return automaticSource;
	}

	public void setAutomaticSource(boolean automaticSource) {
		this.automaticSource = automaticSource;
	}

	public String getAutomaticSrcIndicator() {
		return automaticSrcIndicator;
	}

	public void setAutomaticSrcIndicator(String automaticSrcIndicator) {
		this.automaticSrcIndicator = automaticSrcIndicator;
	}

	public String getManualSource() {
		return manualSource;
	}

	public void setManualSource(String manualSource) {
		this.manualSource = manualSource;
	}

	public String getManualSourceIndicator() {
		return manualSourceIndicator;
	}

	public void setManualSourceIndicator(String manualSourceIndicator) {
		this.manualSourceIndicator = manualSourceIndicator;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
