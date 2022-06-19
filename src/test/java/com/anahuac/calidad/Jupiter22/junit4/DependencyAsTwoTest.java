package com.anahuac.calidad.Jupiter22.junit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.anahuac.calidad.tareasErik.Dependency;

public class DependencyAsTwoTest {

Dependency dependency;
	
	
	@Before
	public void setUp() throws Exception {
		dependency = Mockito.mock(Dependency.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void test() {

		int resEsperado = 0;
		//double resultadoEjecucion= dependency.addTwo(1);
		
		//System.out.println("Result = " + dependency.addTwo(5);// Returns 0 because of the mock
		// Verifying that the method is null with the mocked dependency
		
		assertThat(dependency.addTwo(-2), is(resEsperado));
		
	}

}
