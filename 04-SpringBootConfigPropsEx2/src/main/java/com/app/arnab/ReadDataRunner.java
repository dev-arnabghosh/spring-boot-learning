package com.app.arnab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReadDataRunner implements CommandLineRunner {

	@Autowired
	private MyServiceData msdobj;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(msdobj);
		System.out.println(msdobj.getLdata().getClass().getName());
		System.out.println(msdobj.getSdata().getClass().getName());
		System.out.println(msdobj.getMdata().getClass().getName());
	}

}
