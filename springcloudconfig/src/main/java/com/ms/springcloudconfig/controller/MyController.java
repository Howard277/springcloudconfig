package com.ms.springcloudconfig.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String test(){
		return "ok";
	}
}
