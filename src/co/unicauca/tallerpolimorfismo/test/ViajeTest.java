package co.unicauca.tallerpolimorfismo.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.unicauca.tallerpolimorfismo.cliente.ClienteMain;
import co.unicauca.tallerpolimorfismo.modelo.*;

class ViajeTest {
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeFamiliar en el metodo descripcion")
	@Test
	public void viajeFamiliarTestDescripcion() {
		try {
			String esperado = "Viaje para disfrutar con toda tu familia";
			Viaje ViajeFamiliarT = new ViajeFamiliar("Popayán", "Bogotá", 1250000,
					new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
			final String resultado = ViajeFamiliarT.descripcion();
			//Prueba
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeFamiliar en el metodo metodo2")
	@Test
	public void viajeFamiliarTestMetodo2() {
		try {
			String esperado = "Método implementado en la clase hija viaje familiar";
			Viaje ViajeFamiliarT = new ViajeFamiliar("Popayán", "Bogotá", 1250000,
					new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
			final String resultado = ViajeFamiliarT.cualquierMetodo2();
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeIncentivo en el metodo descripcion")
	@Test
	public void viajeIncentivoTestDescripcion() {
		String esperado = "Viaje incentivo que te envia la empresa Emtel";
		try {
			Viaje viajeIncentivo = new ViajeIncentivo("Popayán", "Medellin", 2100000,
					new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
			final String resultado = viajeIncentivo.descripcion();
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeIncentivo en el metodo metodo2")
	@Test
	public void viajeIncentivoTestMetodo2() {
		String esperado = "Método implementado en la clase hija viaje de incentivo";
		try {
			Viaje viajeIncentivo = new ViajeIncentivo("Popayán", "Medellin", 2100000,
					new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
			final String resultado = viajeIncentivo.cualquierMetodo2();
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeIndividual en el metodo descripcion")
	@Test
	public void viajeIndividualTestDescripcion() {
		String esperado ="Disfruta tu viaje individual";
		try {
			Viaje viajeIndividual = new ViajeIndividual("Popayán", "San Andres", 4250000,
					new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
			final String resultado = viajeIndividual.descripcion();
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	@DisplayName("Comprobar el polimorfismo de la clase viajeTodoIncluido en el metodo descripcion")
	@Test
	public void viajeTodoIncluidoTestDescripcion() {
		String esperado ="Disfruta tu viaje individual";
		try {
			Viaje viajeIndividual = new ViajeIndividual("Popayán", "San Andres", 4250000,
					new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"),
					new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
			final String resultado = viajeIndividual.descripcion();
			Assertions.assertEquals(esperado, resultado, "Las descripciones son diferentes");
		} catch (ParseException ex) {
			Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
