/****************************************************************************************
 * Copyright (c) 2011 KOJ Group. All Rights Reserved.
 * 
 *
 * Rev 1.0   APR 2012 Sanish Gupta
 * 
 ******************************************************************************************/

package com.dev.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropReader {

	private static Logger log = Logger.getLogger(PropReader.class);
	//public static final String DB_PROPERTY_FILE = "/WebContent/WEB-INF/resources/properties/db.properties";
	public static final String DB_PROPERTY_FILE = "D:\\LMG\\WrkspcLUNA\\voucher\\WebContent\\WEB-INF\\resources\\properties\\db.properties";
	
	public static Properties properties = null;
	public static String SIMDB_SID = "DB_SID";
	public static String SIMDB_USER = "DB_USER";
	public static String SIMDB_PASSWORD = "DB_PASSWORD";
	public static String DRIVERTYPE = "DRIVERTYPE";
	public static String SERVER_NAME = "SERVER_NAME";
	public static String PORT = "PORT";
	public static PropReader devPropReader = null;

	/**
	 * Constructor used to load properties values
	 */
	public PropReader() {
		properties = loadConfiguration();
	}

	/**************************************************************************************
	 * This method used to get the Unique instance of KOJPropReader
	 * 
	 * @return
	 *************************************************************************************/
	public static PropReader getUniqueInstance() {

		if (devPropReader == null) {
			devPropReader = new PropReader();
		}
		return devPropReader;
	}

	/**************************************************************************************
	 * This method used to Re-Load the properties files values
	 * 
	 * @return
	 ***************************************************************************************/
	public static Properties loadConfiguration() {
		properties = new Properties();

		
		try {

			System.out.print("Current DIR Pathn # ");
			System.out.println(System.getProperty("user.dir"));
					
			//properties.load(new FileInputStream(System.getProperty("user.dir") + File.separator+"voucher"+File.separator +  DB_PROPERTY_FILE));
			properties.load(new FileInputStream(DB_PROPERTY_FILE));

		} catch (IOException e) {
			log.error("Error occured : " + e);
			e.printStackTrace();
		}
		return properties;
	}

	/**************************************************************************************
	 * This method used to the values of Properties on basis of Key
	 * 
	 * @return
	 ***************************************************************************************/
	public String getSID() {
		return properties.getProperty(SIMDB_SID);
	}

	public String getUser() {
		return properties.getProperty(SIMDB_USER);
	}

	public String getPasswd() {
		return properties.getProperty(SIMDB_PASSWORD);
	}

	public String getDriverType() {
		return properties.getProperty(DRIVERTYPE);
	}

	public String getServerName() {
		return properties.getProperty(SERVER_NAME);
	}

	public int getPortNo() {
		return Integer.parseInt(properties.getProperty(PORT));
	}

}
