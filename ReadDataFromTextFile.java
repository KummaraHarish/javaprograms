package com.common_java_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		//Approach one using file reader and buffer reader
		
		FileReader fr= new FileReader("C:\\Test.txt");
		BufferedReader bf=new BufferedReader(fr);
		
		String  str;
		
		while((str= bf.readLine())!=null){
			System.out.println(str);
		}
		bf.close();

	}

}
