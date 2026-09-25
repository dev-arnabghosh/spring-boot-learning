package com.app.arnab.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("prod") // only on prod
@Profile({"prod", "prodsp", "uat"}) // only if one these is active 
public class BackupDataServiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BackupDataServiceRunner.run()");
	}

}
