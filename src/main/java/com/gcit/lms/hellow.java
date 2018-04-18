package com.gcit.lms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellow {

	
	@RequestMapping(name = "/j")
	public String test() {
		return "hellow world - Jenkins Test!";
	}
	
}
