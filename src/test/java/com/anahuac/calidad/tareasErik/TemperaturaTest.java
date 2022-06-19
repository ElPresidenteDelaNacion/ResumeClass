package com.anahuac.calidad.tareasErik;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class TemperaturaTest {

	
	private Temperaturas t = new Temperaturas();
	
	
	@Test
	void testCAF() {
		double resultadoEsperado=33.8;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= t.cAF(1);
		//Verificacion
		assertThat(resultadoEjecucion, is(closeTo(resultadoEsperado, 0.01)));
		//assertThat(resultadoEjecucion,is(closeTo(resultadoEsperado, 0.01)));
	}
	
	@Test
	void testFAC() {
		double resultadoEsperado=0.0;
		Prueba p = new Prueba();
		//Ejercicio del codigo
		double resultadoEjecucion= t.fAC(32.0);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
		
		//assertThat(celsius.getValue(), is(closeTo(expectitedResult, conversionError)));
	}

}
