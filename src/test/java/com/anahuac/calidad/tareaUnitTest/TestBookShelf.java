package com.anahuac.calidad.tareaUnitTest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import java.io.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.mayab.calidad.tareaUnitTest.entities.Book;
import com.mayab.calidad.tareaUnitTest.entities.BookShelf;
import com.mayab.calidad.tareaUnitTest.entities.BookShelfCapacityReached;

public class TestBookShelf {
	
	public BookShelf bookShelfExc;
	public BookShelf bookShelfAdd;
	public BookShelf bookShelfArr;
	public Book libro;
	public BookShelfCapacityReached BSCR;
	public String title;
	public String author;
	public LocalDate publishedOn;

	@Before
	public void setUp() throws Exception {
		bookShelfAdd = new BookShelf();
		libro = new Book(title, author, publishedOn);
		bookShelfExc = new BookShelf(3);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		LocalDate fechaActual = LocalDate.of(2019, Month.JANUARY, 1);
		Book newBook1 = new Book("Don Quijote","Miguel de Cervantes",fechaActual);
		Book newBook2 = new Book("Don ","Miguel",fechaActual);
		bookShelfAdd.add(newBook1);
		bookShelfAdd.add(newBook2);
		System.out.println(newBook1);
		int nLibro = bookShelfAdd.books().size();
		System.out.println(newBook2);
		 
		assertThat(nLibro, is(2));
	}
	
	@Test(expected=BookShelfCapacityReached.class)
	public void testAddExcepción() {
		
		LocalDate fechaActual = LocalDate.of(2019, Month.JANUARY, 1);
		Book newBook1 = new Book("Don Quijote","Miguel de Cervantes",fechaActual);
		Book newBook2 = new Book("Don ","Miguel",fechaActual);
		Book newBook3 = new Book("Don ","Miguel",fechaActual);
		Book newBook4 = new Book("Don ","Miguel",fechaActual);
		Book newBook5 = new Book("Don ","Miguel",fechaActual);
		bookShelfExc.add(newBook1);
		System.out.println(newBook1);
		bookShelfExc.add(newBook2);
		System.out.println(newBook2);
		bookShelfExc.add(newBook3);
		System.out.println(newBook3);
		bookShelfExc.add(newBook4);
		System.out.println(newBook4);
		bookShelfExc.add(newBook5);
		int nLibro = bookShelfAdd.books().size();
		System.out.println(newBook5);
		
		 
		//assertThat(nLibro, is(3));
	}

	
	@Test
	public void testArrange () {
		LocalDate fechaActual = LocalDate.of(2019, Month.JANUARY, 1);
		Book newBook1 = new Book("A travez de mi ventana","Miguel Angel",fechaActual);
		Book newBook2 = new Book("Nunca mas ","Donatelo",fechaActual);
		Book newBook3 = new Book("Don Quijote","Rafaelo",fechaActual);
		bookShelfAdd.add(newBook2);
		bookShelfAdd.add(newBook1);
		bookShelfAdd.add(newBook3);
		List<Book> orden =bookShelfAdd.arrange();
		System.out.println(orden);
		assertThat(bookShelfAdd.arrange(), is(orden));
		
	}


}
