package com.anahuac.calidad.tareaUnitTest;

import static org.junit.Assert.*;
import java.io.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;

import org.mockito.Mockito;

import com.mayab.calidad.tareaUnitTest.entities.Book;
import com.mayab.calidad.tareaUnitTest.entities.BookShelf;
import com.mayab.calidad.tareaUnitTest.entities.BookShelfCapacityReached;


public class TestBookShelf {
	
	
	private BookShelf bookShelf;
	private Book libro;
	private BookShelfCapacityReached BSCR;
	public String title;
	public String author;
	public LocalDate publishedOn;

	@Before
	public void setUp() throws Exception {
		
		libro = new Book(title, author, publishedOn);
		bookShelf = new BookShelf(3);
		
		
		
		//BSCR = Mockito.mock(BookShelfCapacityReached.class);
		
	}

	@After
	
	public void tearDown() throws Exception {
		
		
		
	}

	@Test
	public void testAdd() {
		String menssage = " ";
		String fechaTexto1 = "2021-10-13";
		String fechaTexto2 = "2021-10-18";
		String fechaTexto3 = "2021-10-15";
		LocalDate fechaActual = LocalDate.parse(fechaTexto1);
		
		String libroNuevo = bookShelf.add("qwewq","sss",fechaActual);
		
	}
	
	@Test
	public void testAddExcepción() {
		fail("Not yet implemented");
	}

	
	@Test
	public void testArrange () {
		fail("Not yet implemented");
	}


}
