package com.common_java_Programs;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {

		String str = " java  Language is most      trending now a days  ";
		System.out.println(str);
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
