package com.tns.api;

import java.util.Arrays;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>values=Arrays.asList(11,22,33,44,55,66,77,88,99);
		values.stream().sorted().forEach(i->System.out.println(i));
	}

}