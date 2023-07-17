package com.common_java_Programs;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		String arr[]= {"java", "python", "C#", "C", "Java" ,"C"};
		
		boolean flag= false;
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.println("Duplicate elements Found "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false){
			System.out.println("Duplicated elements not found");
		}

	}

}
