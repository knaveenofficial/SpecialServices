/**
 * 
 */
package com.macro.services.rest.common;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author naveenK
 *
 */
@RestController
@RequestMapping("/basicCalulator")
public class BasicCalculator {
		@RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }
	
}
 