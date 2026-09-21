package com.app.arnab;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class MyServiceData {

	private int id;
	private String code;
	private boolean active; // not isActive

	private List<String> ldata; // ArrayList
	private Set<String> sdata; // LinkedHashSet
	private String[] adata;

	private Map<String, String> mdata; // LinkedHashMap
	private Properties pdata;

	private Process pob;

	public MyServiceData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getLdata() {
		return ldata;
	}

	public void setLdata(List<String> ldata) {
		this.ldata = ldata;
	}

	public Set<String> getSdata() {
		return sdata;
	}

	public void setSdata(Set<String> sdata) {
		this.sdata = sdata;
	}

	public String[] getAdata() {
		return adata;
	}

	public void setAdata(String[] adata) {
		this.adata = adata;
	}

	public Map<String, String> getMdata() {
		return mdata;
	}

	public void setMdata(Map<String, String> mdata) {
		this.mdata = mdata;
	}

	public Properties getPdata() {
		return pdata;
	}

	public void setPdata(Properties pdata) {
		this.pdata = pdata;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Process getPob() {
		return pob;
	}

	public void setPob(Process pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "MyServiceData [id=" + id 
				+ ", code=" + code 
				+ ", active=" + active 
				+ ", ldata=" + ldata 
				+ ", sdata=" + sdata 
				+ ", adata=" + Arrays.toString(adata) 
				+ ", mdata=" + mdata 
				+ ", pdata=" + pdata 
				+ ", pob=" + pob + "]";
	}

}
