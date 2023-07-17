package com.common_java_Programs;

import java.util.HashSet;

public class DuplicateElementsinArray2UsingHashset {

	public static void main(String[] args) {
		String arr[]= {"java", "python", "C#", "java"};
		
		HashSet<String> langs= new HashSet();
		
		boolean flag=false;
		for(String l:arr){
			if(langs.add(l)== false){
				System.out.println("found duplicate element " + l);
				flag=true;
				
			}
		}
		if(flag==false){
			System.out.println("not found duplicate");
		}


	}

}
