package com.wipro.languagebasics;
class Animal {
	
	public void eat () {
		System.out.println("Animal eats");
	}
	
	public void sleep () {
		System.out.println("Animal sleeps");
	}
}

class Bird extends Animal {


	public void eat () {
		System.out.println("Bird eat");
	}
	

	public void sleep () {
		System.out.println("Bird sleep");
	}
	
	public void fly () {
		System.out.println("Bird fly");
	}
}

public class EX38 {
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.eat();
	animal.sleep();

	Bird bird = new Bird();
	bird.eat();
	bird.sleep();
	bird.fly();
}
}