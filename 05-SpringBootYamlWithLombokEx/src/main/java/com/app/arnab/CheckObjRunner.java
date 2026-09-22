package com.app.arnab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CheckObjRunner implements CommandLineRunner {

	@Autowired
	private EmailConfig emobj;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(emobj);
	}

}
