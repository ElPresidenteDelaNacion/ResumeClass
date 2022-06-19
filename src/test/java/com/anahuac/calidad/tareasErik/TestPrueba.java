package com.anahuac.calidad.tareasErik;



import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TestPrueba {
	
	private Prueba p;
	
	@BeforeAll
	static void antesDeTodo() {
		System.out.println("Antes de todas las pruebas");
	}
	
	@BeforeEach
	void setup(){
		p=new Prueba();
		System.out.println("Antes");
	}
	
	
	@AfterEach
	void tearDown() {
		System.out.println("Despues");
	}
	
	@Disabled
	@Test
	void testSuma() {
		double resultadoEsperado=3;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= p.suma(1,2);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
	}
	
	@Tag("Resta")
	@DisplayName("Test de resta positiva")
	@Test
	void testRestaPositivo() {
		double resultadoEsperado=2;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= p.resta(5,3);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
	}
	
	@Tag("Resta")
	@DisplayName("Test de resta negativo")
	@Test
	void testRestaNegativos() {
		double resultadoEsperado=-8;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= p.resta(-5,3);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
	}
	
	@Test
	void testMultiplicacion() {
		double resultadoEsperado=20;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= p.multiplicacion(5,4);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
	}
	
	@Test
	void testDivision() {
		double resultadoEsperado=5;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= p.division(10,2);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
	}
	
	
	//@Test
	//void testDivisionCero() {
		//Exception exception = assertThrows(ArithmeticException.class,() -> {
			//p.division(5, 0);
		//});
		//String expectedMessage = "La division entre cero no esta permitida";
		//String actualMessage = exception.getMessage();
		
		//assertThat(actualMessage, is(expectedMessage));
		
	
	//}
	


}
