package com.pedigree.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	String PropertiesFile = System.getProperty("user.dir")+"\\TestData\\PropertiesFile.properties";

	public Properties getPropertiesFile() throws IOException {
		FileInputStream inputstream = new FileInputStream(PropertiesFile);
		Properties prt = new Properties();
		prt.load(inputstream);
		return prt;
	}
}
