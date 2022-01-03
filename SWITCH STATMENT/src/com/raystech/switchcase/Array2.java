package com.raystech.switchcase;

public class Array2 {
public static void main(String[] args) {
	int table [][] =new int [10][10];
	for (int i =0; i < 10; i++) {
		 for (int j = 0; j < 10; j++) {
			 table[i][j] = (i+1)*(j+1);
			 if(table[i][j]>9)
			 System.out.print(table[i][j] + " "); 
		 else
			 System.out.print(" "+table[i][j] + " "); 
				 
			 }
		 System.out.println("    ");
			 
			 
			 
		 }
		 
	 }
	
	
}


