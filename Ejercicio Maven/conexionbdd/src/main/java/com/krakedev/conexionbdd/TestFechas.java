package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		SimpleDateFormat sf = new SimpleDateFormat ("yyyy/MM/dd hh:mm:ss");
		
		String fechaStr = "2020/03/22 10:05:04";
		
		
	 	try {
			Date fecha = sf.parse(fechaStr); // de util
			System.out.println(fecha);
			
			long fechamilies = fecha.getTime();
			 System.out.println(fechamilies);
			 
			 java.sql.Date fechaSql = new java.sql.Date(fechamilies);
			 System.out.println(fechaSql);
			 
			 Time timeSql = new Time(fechamilies);
			System.out.println(timeSql);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
