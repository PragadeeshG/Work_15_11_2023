package com.test1;

public class CanonicalScrMeta {
	private String countryCode;
	private String rtngMeta;
	private String src;
	private String template;
	private boolean transactionType;
	private Integer routingSystem;
	private boolean rtdRoutingType;
	private String rtdRoutingSystem;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CanonicalScrMeta() {

	}

	public CanonicalScrMeta(String countryCode, String rtngMeta, String src, String template, boolean transactionType,
			Integer routingSystem, boolean rtdRoutingType, String rtdRoutingSystem, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.countryCode = countryCode;
		this.rtngMeta = rtngMeta;
		this.src = src;
		this.template = template;
		this.transactionType = transactionType;
		this.routingSystem = routingSystem;
		this.rtdRoutingType = rtdRoutingType;
		this.rtdRoutingSystem = rtdRoutingSystem;
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

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public boolean isTransactionType() {
		return transactionType;
	}

	public void setTransactionType(boolean transactionType) {
		this.transactionType = transactionType;
	}

	public Integer getRoutingSystem() {
		return routingSystem;
	}

	public void setRoutingSystem(Integer routingSystem) {
		this.routingSystem = routingSystem;
	}

	public boolean isRtdRoutingType() {
		return rtdRoutingType;
	}

	public void setRtdRoutingType(boolean rtdRoutingType) {
		this.rtdRoutingType = rtdRoutingType;
	}

	public String getRtdRoutingSystem() {
		return rtdRoutingSystem;
	}

	public void setRtdRoutingSystem(String rtdRoutingSystem) {
		this.rtdRoutingSystem = rtdRoutingSystem;
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
