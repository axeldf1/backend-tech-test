package com.littlebill.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="com.littlebill.webapp")
public class CustomProperties {

	private String apiUrl;
	private String apiCatFact;
	
}
