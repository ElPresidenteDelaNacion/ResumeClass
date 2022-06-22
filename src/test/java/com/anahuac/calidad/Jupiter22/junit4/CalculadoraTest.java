package com.anahuac.calidad.Jupiter22.junit4;

import static org.hamcrest.MatcherAssert.assertThat;


import static org.hamcrest.Matchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.anahuac.calidad.tareasErik.Prueba;



//@RunWith(Parameterized.class)
public class CalculadoraTest {

	private Prueba p;
	
	@Before
	public void setUp() throws Exception {
		p = new Prueba();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testSuma() {
		double resultadoEsperado=3;
		//Ejercicio del codigo
		double resultadoEjecucion= p.suma(1,2);
		//Verificacion
		assertThat(resultadoEjecucion,is(resultadoEsperado));
		
		
	}
	
	

	//@Test(expected = AritmeticException.class)
	//void testDivisionCero() {
		//Exception exception = assertThrows(ArithmeticException.class,() -> {
			//p.division(5, 0);
		//});
		//double resEsperado = 2;
		//String expectedMessage = "La division entre cero no esta permitida";
		//String actualMessage = exception.getMessage();
		//double resEjecucion = p.divisionEntera(5,0);
		//assertThat(actualMessage, is(expectedMessage));
		
	
	//}

}
