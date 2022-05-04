package com.indiabix.regex;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Matcher;

public class Example5 
{
	private static String regex = "Nagpur";
	private static String str = "I Love Nagpur "+"Nagpur is famous for oranges";
	private static String replace = "Amaravati";
	public static void main(String[] args)
	{
		try
		{
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			str = m.replaceAll(replace);
			System.out.println(str);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("Pattern Syntax Exception: "+e.getDescription());
			System.out.println("Index: "+e.getIndex());
			System.out.println("Message: "+e.getMessage());
		}
	}
}
