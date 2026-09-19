package com.app.arnab.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email.config")
public class EmailConfig {

	private String host;
	private int port;
	private boolean active;
	private String usr;

	public EmailConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	@Override
	public String toString() {
		return "EmailConfig [host=" + host 
				+ ", port=" + port 
				+ ", active=" + active 
				+ ", usr=" + usr + "]";
	}

}
