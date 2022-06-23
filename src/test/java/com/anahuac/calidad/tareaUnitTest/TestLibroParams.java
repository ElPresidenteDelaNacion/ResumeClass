package com.anahuac.calidad.tareaUnitTest;



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
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(Parameterized.class)
public class TestLibroParams {

	public String arg1;
	public String arg3;
	public LocalDate arg2;
	public BookShelf bookShelf = new BookShelf();
	//public Book book = new Book(String, String, LocalDate);
	
	public TestLibroParams(String arg1, LocalDate arg2, String arg3) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.arg3 = arg3;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"ATravezDeMi", LocalDate.of(2021, Month.NOVEMBER, 14), "Miguel Angel"},
			{"NuncaMas",LocalDate.of(2020, Month.DECEMBER, 18), "Donatelo"},
			{"DonQuijote",LocalDate.of(2019, Month.JANUARY, 11), "Rafaelo"},
			{"Cumbres",LocalDate.of(2016, Month.FEBRUARY, 26),"Emily" }
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
	public void testGetAuthor() {
		Book libroNuevo = new Book(this.arg1,this.arg3,this.arg2);
		bookShelf.add(libroNuevo);
		//List<Book> ordenAuthor=bookShelf.sortByAuthor();
		//System.out.println(ordenAuthor);
		assertThat(this.arg3,is(libroNuevo.getAuthor()));
	}

}
