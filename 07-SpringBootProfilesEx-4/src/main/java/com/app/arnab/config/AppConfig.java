package com.app.arnab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.app.arnab.service.PdfExportService;

@Configuration
public class AppConfig {

	@Bean
	@Profile({"qa", "default"})
	public PdfExportService pdf() {
		PdfExportService pob = new PdfExportService();
		pob.setFileExt(".pdf");
		pob.setFtype("Document-NPDF");		
		return pob;
	}
}
