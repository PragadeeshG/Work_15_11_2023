package com.test1;

public class CanonicalSrcMetaHistory {
	private String historyDate;
	private String countryCode;
	private String rtngMeta;
	private String src;
	private String actionFlag;
	private boolean actionDone;
	private String actionType;
	private String actedBy;
	private String actionSource;
	private String updatedFromSource;
	private String removedFromSource;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CanonicalSrcMetaHistory() {

	}

	public CanonicalSrcMetaHistory(String historyDate, String countryCode, String rtngMeta, String src,
			String actionFlag, boolean actionDone, String actionType, String actedBy, String actionSource,
			String updatedFromSource, String removedFromSource, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.historyDate = historyDate;
		this.countryCode = countryCode;
		this.rtngMeta = rtngMeta;
		this.src = src;
		this.actionFlag = actionFlag;
		this.actionDone = actionDone;
		this.actionType = actionType;
		this.actedBy = actedBy;
		this.actionSource = actionSource;
		this.updatedFromSource = updatedFromSource;
		this.removedFromSource = removedFromSource;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
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

	public String getActionFlag() {
		return actionFlag;
	}

	public void setActionFlag(String actionFlag) {
		this.actionFlag = actionFlag;
	}

	public boolean isActionDone() {
		return actionDone;
	}

	public void setActionDone(boolean actionDone) {
		this.actionDone = actionDone;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActedBy() {
		return actedBy;
	}

	public void setActedBy(String actedBy) {
		this.actedBy = actedBy;
	}

	public String getActionSource() {
		return actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
	}

	public String getUpdatedFromSource() {
		return updatedFromSource;
	}

	public void setUpdatedFromSource(String updatedFromSource) {
		this.updatedFromSource = updatedFromSource;
	}

	public String getRemovedFromSource() {
		return removedFromSource;
	}

	public void setRemovedFromSource(String removedFromSource) {
		this.removedFromSource = removedFromSource;
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
