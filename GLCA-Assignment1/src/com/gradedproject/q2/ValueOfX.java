package com.gradedproject.q2;

import java.util.Scanner;

public class ValueOfX {
	public static long powerValueCalculate(int num,int n)
	{
		if(n==0)
			return 1;
		
		return num*powerValueCalculate(num,n-1);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number X:");
		int num=sc.nextInt();
		System.out.println("Enter the power N:");
		int n=sc.nextInt();
		sc.close();
		if(num==0)
		{
			System.out.println("X power N is: 0");
		}
		else
		{
			System.out.println("X power N is: "+powerValueCalculate(num,n));
		}

	}

}
