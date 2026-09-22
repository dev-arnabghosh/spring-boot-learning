package com.app.arnab;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("my.app")
@Data
public class EmailConfig {

	private String host;
	private Integer port;
	private String username;
	private String password;

	private Set<String> protocols;
	private Map<String, String> headers;
	
	private Certificate certificate;	

}
