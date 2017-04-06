/**
 * 
 */
package com.macro.services.error.model;

import java.util.List;

/**
 * @author Naimisha
 *
 */
public class ErrorResponseModel {
	private List<ErrorModel> errors;
	/**
	 * 
	 */
	public ErrorResponseModel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the errors
	 */
	public List<ErrorModel> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}
	

}
