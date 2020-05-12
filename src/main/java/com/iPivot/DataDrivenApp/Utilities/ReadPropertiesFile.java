package com.iPivot.DataDrivenApp.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	String filepath=System.getProperty("user.dir")+"/src/main/resource/com/iPivot/DataDrivenApp/PropertiesFile/config.properties";

	Properties prop=new Properties();
	
	public String readPropFileByKey(String key) throws IOException
	{
		System.out.println("Reading file");
		File f=new File(filepath); //common man
		FileInputStream fis=new FileInputStream(f); // Artist
 		
		prop.load(fis); // special artist
  		return prop.getProperty(key); //special artist reading the file
	
	
	}
}
 

