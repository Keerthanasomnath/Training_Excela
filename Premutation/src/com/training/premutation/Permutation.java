package com.training.premutation;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
	
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str=sca.nextLine();
		int len=str.length();
		
		Function function= new Function();
		function.permute(str, 0, len-1);	
		sca.close();
	}
}

