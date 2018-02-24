package com.java8;

import java.util.ArrayList;
import java.util.List;

/*
 * Method references help to point to methods by their names. A method reference is described using "::" symbol.
 * */
public class MethodReferenceFeature {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		//names.forEach(i->System.out.println(i));
		// WITH METHOD REFERENCE
		names.forEach(System.out:: println);
	}
}
