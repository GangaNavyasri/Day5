package com.capgeminiday5.tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgeminiday5.InEligibleException;
import com.capgeminiday5.InvalidCountryException;
import com.capgeminiday5.InvalidNameException;
import com.capgeminiday5.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws InvalidCountryException, InvalidNameException, InEligibleException {
		assertEquals(2500.0, TaxCalculator.calculateTax("Ron", true, 50000.0),0.02);
		assertEquals(3300.0, TaxCalculator.calculateTax("Jack", true, 55000.0),0.02);

	}
	@Test
    void testInvalidCountryException() {
		Exception e;
		e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax("Ron", false, 20000.0));
		assertEquals("The employee should be an indian citizen for calculating tax", e.getMessage());
	}
@Test
void testInvalidNameException() {
	Exception e;
	e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax(" ", true, 30000.0));
	assertEquals("The employee name cannot be Empty", e.getMessage());
}
@Test
void testInEligibleException() {
	Exception e;
	e = assertThrows(Exception.class, () ->TaxCalculator.calculateTax("Tim", false, 30000.0));
	assertEquals("The employee should be an indian citizen for calculating tax",e.getMessage());
}
}
