package com.krakedev.ejercicios;


import org.apache.logging.log4j.Logger;

public class Admin {

	private static Logger logger = org.apache.logging.log4j.LogManager.getLogger(Admin.class);
	
	
	
	public void agregar() {
		logger.warn("memsaje de warn");
		logger.info("memsaje de info");
		logger.debug("memsaje de debug");
		logger.trace("memsaje de trace");
		logger.error("memsaje de error");

		
	}
	
	
	
	
	
	
}
