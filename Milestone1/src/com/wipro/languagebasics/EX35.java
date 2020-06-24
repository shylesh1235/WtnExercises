package com.wipro.languagebasics;
class Box
{
	private int height;
	private int width;
	private int depth;
	public Box(int height,int width,int depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public int volume()
	{
		int volume = height*width*depth;
		return volume;
	}
}
public class EX35 {
  public static void main(String[] args) {
		Box box = new Box(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		System.out.println("Volume of Box is "+box.volume());
	}
	}
