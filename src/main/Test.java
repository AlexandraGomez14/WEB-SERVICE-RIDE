package main;

import dao.ViajeFacade;
import utils.JpaUtils;

public class Test {

	public static void main(String[] args) {
		if (JpaUtils.getEntityManagerFactory() != null) {
			System.out.println("Exito al conectar");

		} else {
			System.out.println("error al conectar");
		}
		ViajeFacade viaje = new ViajeFacade();
		viaje.findByTelefono("79896090");
	}
}
 