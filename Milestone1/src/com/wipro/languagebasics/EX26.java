package com.wipro.languagebasics;
import java.util.Arrays;
public class EX26 {
	public static void main(String[] args) {
		int []a= {10,90,87,21,27,55,81,45};
		Arrays.parallelSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	}

