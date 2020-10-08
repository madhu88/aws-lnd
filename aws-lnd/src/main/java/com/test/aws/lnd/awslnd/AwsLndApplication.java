package com.test.aws.lnd.awslnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.test.aws.lnd"})
public class AwsLndApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLndApplication.class, args);
	}

}
