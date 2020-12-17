package com.test.aws.lnd.controllers.dynamodb;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.aws.lnd.model.dynamodb.DynamoDBRequest;
import com.test.aws.lnd.model.dynamodb.DynamoDBResponse;


@RestController
@RequestMapping(value = "/dynamodb")
public class DynamoDBController {
	
	@PostMapping(value = "/createtable", produces = MediaType.APPLICATION_JSON_VALUE)
	public DynamoDBResponse createTable(@RequestBody DynamoDBRequest dynamoDBRequest) {
		DynamoDBResponse dynamoDBResponse = new DynamoDBResponse();
		return dynamoDBResponse;
	}
	
	@RequestMapping(value = "/gettable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public DynamoDBResponse getTable() {
		DynamoDBResponse dynamoDBResponse = new DynamoDBResponse();
		dynamoDBResponse.setResponse("table created");
		return dynamoDBResponse;
	}
}
