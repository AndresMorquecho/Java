package com.krakedev.persistencia.test.Personas;

import java.util.ArrayList;

import com.krakedev.persistencia.ejercicios.AdminPersonas;
import com.krakedev.persistencia.entidades.Personas;

public class TestConsultaPersonas {

	public static void main(String[] args) {

		try {
			ArrayList<Personas> personas = AdminPersonas.buscarPorNombre("Julio");

			System.out.println(personas);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
