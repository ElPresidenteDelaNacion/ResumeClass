package com.anahuac.calidad.tareasErik;

import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;

class TestCalculadoraParams {

	
	private Prueba p;
	
	//@Before
	void setup(){
		p=new Prueba();
		System.out.println("Antes");
	}
	
	//private static Stream<Arguments> inputSuma(){
		//return Stream.of(
				//Arguments.of(1f,1f,2f),
				//Arguments.of(2f,3f,5f),
				//Arguments.of(5f,0f,5f)
				//);
	//}
	
	//es una prueba parametrica
	//@ParameterizedTest
	//indica que metodos tiene la prueba
	//@MethodSource("inputSuma")
	//Marcar esto como una suma
	
	public void testSuma(float sumando1, float sumando2, float resultadoEsperado) {
		//Inicializacion
		float resultadoEjecucion=p.suma(sumando1, sumando2);
		Prueba p = new Prueba();
		//assertThat(resultadoEjecucion,is(resultadoEsperado));
		//Verificacion
	}

}
