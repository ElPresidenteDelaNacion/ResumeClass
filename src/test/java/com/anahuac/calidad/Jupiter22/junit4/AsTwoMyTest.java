package com.anahuac.calidad.Jupiter22.junit4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.anahuac.calidad.tareasErik.Dependency;

public class AsTwoMyTest {

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

		int resEsperado = 5;
		int dameEsto = 5;
		//double resultadoEjecucion= dependency.addTwo(1);
		when(dependency.addTwo(2)).thenReturn(dameEsto);
		int numeroEsperado = dependency.addTwo(2);
		//System.out.println("Result = " + dependency.addTwo(5);// Returns 0 because of the mock
		// Verifying that the method is null with the mocked dependency
		
		assertThat(numeroEsperado, is(resEsperado));
		
	}
	
	
	@Test
	public void setBehavior() {

		when(dependency.getClassName()).thenReturn("UwU");
		
		String superSaludo = dependency.getClassName();
		
		assertThat(superSaludo, is("UwU"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void setExpected() {

		
		when(dependency.getClassName()).thenThrow(IllegalArgumentException.class);
		
		String superSaludo = dependency.getClassName();
		
		assertThat(superSaludo, is("holiwi"));
	}
	
	@Test
	public void setCallRealMethod() {

		when(dependency.addTwo(2)).thenCallRealMethod();
		
		int numeroException = dependency.addTwo(2);
		
		assertThat(numeroException, is(4));
	}
	
	@Test
	public void setAnyInt() {
		
		when(dependency.addTwo(anyInt())).thenReturn(10);
		
		int numeroADar = dependency.addTwo(198761);
		
		assertThat(numeroADar, is(10));
	}
	
	//Comportamiento al vuelo
	@Test
	public void setThenAnswer() {
		
		when(dependency.addTwo(anyInt())).thenAnswer(new Answer<Integer>() {
				
				public Integer answer(InvocationOnMock invocation) throws Throwable {
			int arg = (Integer) invocation.getArguments()[0];
			//Esto se le suma a lo que le pidamos
			return arg + 20;
		}
	});
		//Da 30
		assertThat(dependency.addTwo(10), is(30));
	}
	
	@Test
	public void setThenAnswer2() {
		
		when(dependency.addTwo(anyInt())).thenAnswer(new Answer<Integer>() {
				
				public Integer answer(InvocationOnMock invocation) throws Throwable {
			int arg = (Integer) invocation.getArguments()[0];
			return arg + 20;
		}
	});
		//ahora da 50
		assertThat(dependency.addTwo(30), is(50));
	}
	
	
}
