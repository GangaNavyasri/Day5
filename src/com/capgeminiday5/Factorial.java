package com.capgeminiday5;

public class Factorial {
	public int getFactorial(int num) throws InvalidInputException,FactorialException{
		int fact=1 ;
		if(num<2)
		{
			throw new InvalidInputException("Invalid Input");
		}
		for(int i=1;i<=num;i++)
		{
			fact=fact*i ;
			if(fact<0)
			{
				throw new FactorialException("number should not be less than zero");
			}
			
		}
		return fact ;
	}

}
