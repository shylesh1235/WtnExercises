package com.wipro.languagebasics;

public class EX6 {
public static void main(String args[])
{ 
	int i;
	int a=args.length;
	if(a==0)
	{
		System.out.println("No Values");
	}
	if(a>1)
	{
		for(i=0;i<=a;i++)
		{
			System.out.println(args[i]+","+args[i+1]);
			
		}
	}
}
}
