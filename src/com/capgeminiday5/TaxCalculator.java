package com.capgeminiday5;

public class TaxCalculator {

	public static double calculateTax(String empName, boolean IsIndian, double empSalary)
			throws InvalidCountryException, InvalidNameException, InEligibleException {
		double taxAmount=0;
		if (empName == null || empName ==" ") {
			throw new InvalidNameException("The employee name cannot be Empty");
		} else if (IsIndian == false) {
			throw new InvalidCountryException("The employee should be an indian citizen for calculating tax");

		} else if (empSalary > 100000) {
			return taxAmount = (empSalary * 8)/100;
		}
		else if (empSalary > 50000 && empSalary <=100000) {
				return taxAmount = (empSalary *6)/100;
			}
		else if (empSalary > 30000 && empSalary <= 50000) {
				return taxAmount = (empSalary *5)/100;
			}
		else if (empSalary > 10000 && empSalary <=30000) {
				return taxAmount = (empSalary *4)/100;
			}
		else if (empSalary < 10000) {
				throw new InEligibleException("The employee does not to pay tax");
			}	
		return taxAmount;
       }
}
