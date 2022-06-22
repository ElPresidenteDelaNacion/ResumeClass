package com.anahuac.calidad.tareaUnitTest;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.mayab.calidad.tareaUnitTest.entities.Book;
import com.mayab.calidad.tareaUnitTest.entities.BookShelf;


@RunWith(Parameterized.class)
public class TestLibroParams {

	public String arg1;
	public String arg2;
	public LocalDate arg3;
	public BookShelf bookShelf = new BookShelf();
	
	public TestLibroParams(String arg1, String arg2, LocalDate arg3) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"ATravezDeMi","Miguel Angel", LocalDate.of(2021, Month.NOVEMBER, 14)},
			{"NuncaMas","Donatelo", LocalDate.of(2020, Month.DECEMBER, 18)},
			{"DonQuijote","Rafaelo",LocalDate.of(2019, Month.JANUARY, 11)},
			{"Cumbres","Emily",LocalDate.of(2016, Month.FEBRUARY, 26)}
		});
				
	}
	
	@Before
	public void setUp() {
		System.out.println("Antes");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrderAuthor() {
		Book libroNuevo = new Book(this.arg1,this.arg2,this.arg3);
		bookShelf.add(libroNuevo);
		List<Book> ordenAuthor=bookShelf.sortByAuthor();
		System.out.println(ordenAuthor);
		assertThat(bookShelf.sortByAuthor(),is(ordenAuthor));
	}

}
