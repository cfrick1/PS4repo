package MainPackage;

import java.lang.Math;

public class Calculator {
	
	private double investment_amount = 0;
	private int years = 0;
	private double annual_interest_rate = 0;
	
	public Calculator(){
		
	}
	
	public Calculator(double investment_amount, int years, double annual_interest_rate){
		this.investment_amount = investment_amount;
		this.years = years;
		this.annual_interest_rate = annual_interest_rate;
	}
	
	public  double calculate(){
		double value =  investment_amount*Math.pow(1 + annual_interest_rate / 1200, years*12);
		return value;
	}
	
	public static double round2Places(double d){
		d = Math.round(d*100);
		return d/100;
	}
}
