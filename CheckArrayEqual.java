package com.common_java_Programs;

import java.util.Arrays;

import org.apache.commons.lang3.text.StrSubstitutor;

public class CheckArrayEqual {

	public static void main(String[] args) {
		int a[]={1,9,8,7,1};
		int b[]={1,9,8,7,1,6};
		
	boolean status=true;
	
	if(a.length == b.length){
		for(int i=0;i<a.length;i++){
			
			if(a[i]!=b[i]){
				status=false;
			}
			
		}
		
	}
	
	else{
		status=false;
	}
	if(status == true){
		System.out.println("arrays are equal");
	}
	else{
		System.out.println("arrays are not equal");
	}
		
	}

}
