package com.capgeminiday5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgeminiday5.AgeNotWithinRangeException;
import com.capgeminiday5.NameNotValidException;
import com.capgeminiday5.Student;

class StudentTest {

	@Test
	void testStudent() 
		throws NameNotValidException,AgeNotWithinRangeException {
			
				assertThrows(AgeNotWithinRangeException.class,()-> new Student(24,"navya",22,"Java"));
				assertThrows(NameNotValidException.class,()-> new Student(24,"navya1",21,"Java"));
		}

	}


