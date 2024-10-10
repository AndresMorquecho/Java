package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.ejercicios.AdminPersonas;

public class Convertidor {
	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdminPersonas.class);
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm";

	public static Date convertirFecha(String fechaStrg) throws Exception {

		Date fechaDate = null;

		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		try {
			LOGGER.trace("Convitiendo fecha" + fechaStrg);
			fechaDate = sdf.parse(fechaStrg);
			LOGGER.trace("fecha convertida" + fechaDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			LOGGER.error("La fecha no tiene el formato correcto", e);
			throw new Exception("La fecha no tiene el formato correcto");
		}

		return fechaDate;

	}

	public static Date convertirHora(String fechaStrg) throws Exception {

		Date fechaDate = null;

		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		try {
			fechaDate = sdf.parse(fechaStrg);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			// TODO Auto-generated catch block
			LOGGER.error("La fecha no tiene el formato correcto", e);
			throw new Exception("La hora no tiene el formato correcto: " + fechaStrg);
		}

		return fechaDate;

	}

}
