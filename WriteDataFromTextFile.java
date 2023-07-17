package com.common_java_Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFromTextFile {

	public static void main(String[] args) throws IOException {

		//Approach one using file reader and buffer reader
		
		FileWriter fr= new FileWriter("C:\\Test.txt");
		BufferedWriter bf=new BufferedWriter(fr);
		
		bf.write("java one two three");
		bf.write("python one two three");
		bf.write("c one two three");
		bf.write("cobol one two three");
		
		System.out.println("Finished!!!");
		bf.close();

	}

}
