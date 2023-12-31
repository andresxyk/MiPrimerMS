/**
 * 
 */
package com.cimaru.tst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author soporte
 *
 */
@RestController
public class HelloWorld {
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World!")String name) {
		return String.format("Hello %s", name);
	}

}
