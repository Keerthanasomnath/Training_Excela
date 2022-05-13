package com.training.occurance;
import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n =sc.nextInt();
		System.out.println("enter the elements");
		int[] arr= new int[n];
		int[] arr1= new int[n];

		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++){
			int count=0;
			String position="";
			if(i==0 || arr1[i-1]!=arr1[i]){
				for(int j=0;j<arr.length;j++){
					if(arr1[i]==arr[j]){
						count++;
						position+=Integer.toString(j)+",";
					}
				}
				System.out.println("The element " +arr1[i]+"= The no of times" +count);
				System.out.println("Position="+position.substring(0,position.length()-1));
			}
			else{
				continue;
			}
		}
	sc.close();
	}
}
