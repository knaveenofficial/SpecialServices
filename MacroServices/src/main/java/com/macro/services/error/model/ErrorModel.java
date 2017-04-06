/**
 * 
 */
package com.macro.services.error.model;

/**
 * @author Naimisha
 *
 */
public class ErrorModel {
	private String message;
	private String errorCode;
	private String moreDetails;
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the moreDetails
	 */
	public String getMoreDetails() {
		return moreDetails;
	}
	/**
	 * @param moreDetails the moreDetails to set
	 */
	public void setMoreDetails(String moreDetails) {
		this.moreDetails = moreDetails;
	}
	/**
	 * 
	 */
	public ErrorModel() {
		// TODO Auto-generated constructor stub
	}

}
