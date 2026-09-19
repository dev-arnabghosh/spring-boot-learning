package com.app.arnab.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arnab.bean.EmailConfig;

@Component
public class EmailConfigRunner implements CommandLineRunner {

	@Autowired
	private EmailConfig ecobj;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(ecobj);
	}

}
