package com.anahuac.calidad.tareaUnitTest;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.anahuac.calidad.tareasErik.Dependency;
import com.mayab.calidad.tareaUnitTest.entities.Book;
import com.mayab.calidad.tareaUnitTest.entities.BookShelf;

public class TestBookShelfMock {

	public BookShelf bookShelfAdd;
	
	@Before
	public void setUp() throws Exception {
		bookShelfAdd = Mockito.mock(BookShelf.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMockitoBookShelf() {

		LocalDate fechaPublicacion = LocalDate.of(2019, Month.JANUARY, 1);
		Book newBook1 = new Book("A travez de mi ventana","Miguel Angel",fechaPublicacion);
		Book newBook2 = new Book("Nunca mas ","Donatelo",fechaPublicacion);
		Book newBook3 = new Book("Don Quijote","Rafaelo",fechaPublicacion);
		bookShelfAdd.add(newBook2);
		bookShelfAdd.add(newBook1);
		bookShelfAdd.add(newBook3);
		
		when(bookShelfAdd.sortByAuthor()).thenAnswer(new Answer<Collection>() {
			
			public Collection answer(InvocationOnMock invocation) throws Throwable {
				List<Book> orden = (List<Book>) invocation.getArguments()[0];
				//List<Book> orden = bookShelfAdd.sortByAuthor();
				//System.out.println(orden);
		return bookShelfAdd.sortByAuthor();
	}
});
		
		
		
		
		

	}

}
