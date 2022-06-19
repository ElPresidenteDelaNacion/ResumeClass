package com.anahuac.calidad.tareasErik;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;




@ExtendWith(MockitoExtension.class)
class TestDependency {

	@Mock
	private Dependency dependency;
	
	@BeforeEach
	public void setUp() throws Exception{
		//dependency = Mockito.mock(Dependency.class);
	}
	
	@AfterEach
	public void tearDown() throws Exception{
		
	}
	
	
	@Test
	void test() {

		
		//System.out.println("Result = " + dependency.addTwo(5);// Returns 0 because of the mock
		// Verifying that the method is null with the mocked dependency
		
		
		assertThat(dependency.getClassName(), is(nullValue()));
	}

}
