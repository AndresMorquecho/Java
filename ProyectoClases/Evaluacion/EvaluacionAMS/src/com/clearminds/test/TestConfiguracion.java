package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestConfiguracion {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		
		maquina.configurarMaquina("A1", "A2", "A3", "A4");
		maquina.mostrarConfiguracion();
	}

}
