package io.mosip.kernel.masterdata.constant;

public enum ZoneUserErrorCode {
	USER_MAPPING_EXCEPTION("KER-USR-005", "Zone & User mapping  failed"),
	ZONE_NOT_FOUND_EXCEPTION("KER-USR-008", "Zone not found"),
	ZONE_FETCH_EXCEPTION("KER-USR-009", "Zone ftch  failed"),
	USER_MAPPING_NOT_PRSENT_IN_DB("KER-USR-006", "Zone & User mapping  not present in db"),
	DUPLICATE_REQUEST("KER-USR-007", "duplicate request"),
	USER_MAPPING_PRSENT_IN_DB("KER-USR-010", "The given user already mapped with different zone");
	
	private final String errorCode;
	private final String errorMessage;

	private ZoneUserErrorCode(final String errorCode, final String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
