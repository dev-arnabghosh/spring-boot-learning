package com.app.arnab;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * Note Regarding, When using @ConfigurationProperties it is recommended to add
 * 'spring-boot-configuration-processor' to your classpath to generate
 * configuration metadata
 * 
 * Why this warning? Recommended to add 'spring-boot-configuration-processor' to
 * the pom.xml so Spring Boot can generate configuration metadata for IDE
 * support.
 */
@Component
@ConfigurationProperties("my.app")
public class DatabaseCon {

	private String driver;
	private String url;
	private String username;
	private String password;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver 
				+ ", url=" + url 
				+ ", username=" + username 
				+ ", password=" + password+ "]";
	}

}
