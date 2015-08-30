package com.hp.calc;

public class Calc {
	
	int val1;
	int val2;
	String operator;
	
	public Calc(int val1, int val2, String operator){
		this.val1 = val1;
		this.val2 = val2;
		this.operator = operator;
	}
	
	
	public double doCalc(){
		double output = -99999;
		
		switch (this.operator) {
		case "+":
			output = this.val1 + this.val2;
			break;
			
		case "-":
			output = this.val1 - this.val2;
			break;
			
		case "*":
			output = this.val1 * this.val2;
			break;
			
		case "/":
			output = this.val1 / this.val2;
			break;

		default:
			break;
		}
		
	
		return output;
	}
	
}
