/**
 * 
 */
package com.macro.services.error.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.macro.services.error.model.ErrorModel;
import com.macro.services.error.model.ErrorResponseModel;

/**
 * @author Naimisha
 *
 */
public class ErrorRest {
	@ExceptionHandler(Exception.class)
	public ErrorResponseModel handleGenericExceptions(HttpServletRequest request,HttpServletResponse response,
			Exception e){
		ErrorModel errorModel=new ErrorModel();
		errorModel.setErrorCode("RunTime");
		errorModel.setMessage(e.getMessage());
		errorModel.setMoreDetails(e.getCause().getMessage());
		ErrorResponseModel errorResponseModel=new ErrorResponseModel();
		List<ErrorModel> errormodels=new ArrayList<>();
		errormodels.add(errorModel);
		errorResponseModel.setErrors(errormodels);
		return errorResponseModel;
	}
}
