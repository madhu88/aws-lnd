package com.test.aws.lnd.controllers.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.aws.lnd.model.test.TestResponse;

@RestController
@RequestMapping(value = "/testservice")
public class TestController {

	public TestController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping(value = "/gettestdata", produces = MediaType.APPLICATION_JSON_VALUE)
	public TestResponse getSampleResponse() {
		TestResponse testResponse = new TestResponse();
		testResponse.setText("Welcome to aws learning");
		testResponse.setVersion("0.3");
		return testResponse;
	}
}
