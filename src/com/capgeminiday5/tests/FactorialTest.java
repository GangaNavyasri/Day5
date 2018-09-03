package com.capgeminiday5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgeminiday5.Factorial;
import com.capgeminiday5.FactorialException;

class FactorialTest {

	@Test
	
		void testGetFactorial() throws Exception {
			Factorial f1=new Factorial() ;
			assertThrows(FactorialException.class,()->f1.getFactorial(100));
			assertEquals(120,f1.getFactorial(5));
		}

	
	

}
