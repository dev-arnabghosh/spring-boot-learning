package com.app.arnab.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.arnab.service.ExportExcelService;
import com.app.arnab.service.PdfExportService;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private ExportExcelService eesob;
	
	@Autowired
	private PdfExportService pesob;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(eesob);
		System.out.println(pesob);
	}

}
