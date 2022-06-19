package com.anahuac.calidad.Jupiter22.junit4;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.anahuac.calidad.tareasErik.Prueba;

@RunWith(Parameterized.class)
public class CalculadoraParamTest {

	public double arg1; //value 1
	public double arg2; //value 2
	public double arg3; // expected value
	public Prueba p; // object
	
	public CalculadoraParamTest(double arg1, double arg2, double arg3) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
	}
	
	
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{4, 2, 6},
			{6, -3, 3},
			{5,5,10},
			{5,2,7},
			{5, -2, 3},
			{10,0,10}, //Double.POSITIVE_INFINITY
			{0,0,0} //Double.NaN
		});
				
	}
	
	@Before
	public void setup(){
		p=new Prueba();
		System.out.println("Antes");
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testSuma() {
		double resFinal = p.suma(this.arg1, this.arg2);
		
		assertThat(this.arg3, is(resFinal));
	}
	//es una prueba parametrica
	//@ParameterizedTest
	//indica que metodos tiene la prueba
	//@MethodSource("inputSuma")
	//Marcar esto como una suma
	
	//public void testSuma(float sumando1, float sumando2, float resultadoEsperado) {
		//Inicializacion
		//float resultadoEjecucion=p.suma(sumando1, sumando2);
		//Prueba p = new Prueba();
		//assertThat(resultadoEjecucion,is(resultadoEsperado));
		//Verificacion
	//}
	
}
