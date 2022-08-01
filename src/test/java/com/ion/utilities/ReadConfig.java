package com.ion.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig(){
		File src = new File("./Configuration/config.properties");
		try{
			FileInputStream fi = new FileInputStream(src);
			pro = new Properties();
			pro.load(fi);		
		}
		catch(Exception e){
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL(){
		String url = pro.getProperty("base_url");
		return url;
	}
	
	public String getChromePath(){
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxPath(){
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getIEPath(){
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
}
