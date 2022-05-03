package com.tns.polymorphism;

public class OverLoading1 
{
	void assign(float a,float b)
	{
		System.out.println("Area of Rectangle: "+(float)(a*b) );
	}
	void assign(int a,int b)
	{
		System.out.println("Area of Rectangle: "+(a*b) );
	}
	
	

	public static void main(String[] args) {
		OverLoading1 o=new OverLoading1();
		o.assign(5f,10f);
		o.assign(10, 20);

	}

}