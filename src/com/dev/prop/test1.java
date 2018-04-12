package com.dev.prop;

import java.sql.SQLException;

import com.dev.dao.DBUtil;

public class test1 {

	public static void main(String[] args) 
	{

		
		System.out.println("################################################3 ");
		System.out.println("################################################3 ");
		System.out.println("################################################3 ");
		System.out.print("Current DIR Path # ");
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir") + "/WebContent/WEB-INF/resources/properties/giftGVMax.wsdl");
		
		PropReader.loadConfiguration();
		
		try {
			DBUtil.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//WEB-INF/resources/wsdl/giftGVMax.wsdl
		
		System.out.println("################################################3 ");
		System.out.println("################################################3 ");
		System.out.println("################################################3 ");

	}

}
