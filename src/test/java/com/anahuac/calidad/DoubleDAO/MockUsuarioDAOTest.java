package com.anahuac.calidad.DoubleDAO;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;


import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;



public class MockUsuarioDAOTest {

	private MockUsuarioDAO dao; //mock
	public Map<Integer, Usuario> usuarios; //Fake DB
	
	@Before
	public void setUp() throws Exception {
		
		dao = Mockito.mock(MockUsuarioDAO.class);
		usuarios = new HashMap<Integer, Usuario>();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void testAgregarUsuario() {
		//Setear comportamiento
		Usuario usuario = new Usuario("usuario1", "123456","regular","usuario1@hotmail.com");
		when(dao.agregarUsuario(any(Usuario.class))).thenAnswer(new Answer<Integer>() {
			public Integer answer(InvocationOnMock invocation) {
				Usuario arg = (Usuario) invocation.getArguments()[0];
				int id = usuarios.size() + 1;
				arg.setId(id);
				usuarios.put(id, arg);
				return id;
		}
	});
		int idEjecucion = dao.agregarUsuario(usuario);
		//verificar -assert
		assertThat(idEjecucion, is(usuarios.size()));
		assertThat(usuario.getUsername(), is(usuarios.get(idEjecucion).getUsername()));
		assertThat(usuario.getPassword(), is(usuarios.get(idEjecucion).getPassword()));
		assertThat(usuario.getTipo(), is(usuarios.get(idEjecucion).getTipo()));
		assertThat(usuario.getEmail(), is(usuarios.get(idEjecucion).getEmail()));
		
	}

}
