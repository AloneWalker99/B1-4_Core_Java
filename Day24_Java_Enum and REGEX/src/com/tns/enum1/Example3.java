package com.tns.enum1;
enum Bike
{
	Pulsar,R15,KTM,R3
}
public class Example3 
{
	public static void main(String[] args) 
	{
		/*Bike b;
		  b = Bike.R15;*/
		Bike b = Bike.KTM;
		switch(b)
		{
		case Pulsar:
		System.out.println("You choose Pulsar");
		break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case R3:
			System.out.println("You choose R3");
			break;
			/*default:
				System.out.println("Invalid Name");*/
		}
	}
}
