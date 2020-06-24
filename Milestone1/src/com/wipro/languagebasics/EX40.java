package com.wipro.languagebasics;
class Fruit
{
	String name;
	String taste;
	int size;
	void eat()
	{
		
	}
	
}
class Apple extends Fruit
{
	void eat()
	{
		System.out.println("Apple");
		System.out.println("sweet");
	}
}
class Orange extends Fruit
{
	void eat()
	{
		System.out.println("Orange");
		System.out.println("sour");
	}
}
public class EX40 {
public static void main(String[] args)
{
	Apple a=new Apple();
	a.eat();
	Orange o=new Orange();
	o.eat();
	
}
}
