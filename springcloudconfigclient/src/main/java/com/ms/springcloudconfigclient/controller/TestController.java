package com.ms.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

	@Value("${admin.name}")
	private String name;

	@Value("${admin.password}")
	private String password;

	@RequestMapping(path = "test", method = RequestMethod.GET)
	public String test() {
		return name + " " + password;
	}
}
