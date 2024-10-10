package com.krakedev.EjercicioConexiciones;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilitarios {

	public static java.sql.Date convertirFechaSql(String fecha) {
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yy");

		try {
			Date fechaJava = sf.parse(fecha);
			Long fechamiles = fechaJava.getTime();

			java.sql.Date fechaSql = new java.sql.Date(fechamiles);

			return fechaSql;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static Time ConvertirHora(String fecha) {

		SimpleDateFormat sf = new SimpleDateFormat("HH:mm");

		try {
			Date fechaJava = sf.parse(fecha);
			Long fechamiles = fechaJava.getTime();

			Time timeSql = new Time(fechamiles);

			return timeSql;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
