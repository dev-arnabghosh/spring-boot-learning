package com.app.arnab;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestDataRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		  Process p1 = new Process(); 
		  p1.setCode("A"); 
		  p1.setPort(985);
		 
		
//		Process p1 = 
//				Process.builder()
//				.code("A")
//				.port(985)
//				.build();
		
		System.out.println(p1);
		
	}

}
