package com.wipro.languagebasics;
class Calculator
{
	static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
}
public class EX36 {
	public static void main(String[] args) {
	     System.out.println("PowerInt: "+Calculator.powerInt(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	     System.out.println("PowerDouble: "+Calculator.powerDouble(Double.parseDouble(args[2]), Integer.parseInt(args[3])));
	}
	}
