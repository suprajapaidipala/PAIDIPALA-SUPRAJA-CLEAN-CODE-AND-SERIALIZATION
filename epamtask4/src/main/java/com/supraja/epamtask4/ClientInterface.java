package com.supraja.epamtask4;

import java.io.IOException;


public class ClientInterface  {
	public static void main(String[] args) throws IOException
	{
		CalculationOfSimpleInterestAndCompoundInterest interest_obj = new CalculationOfSimpleInterestAndCompoundInterest();
		interest_obj.calculateInterest();
		EstimationOfCostOfHouseConstruction house_obj= new EstimationOfCostOfHouseConstruction();
		house_obj.costCalculation();
	}
}