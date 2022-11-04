package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {
		
			
			Scanner input=new Scanner(System.in);
			
			System.out.println("enter number of inches in whole numbers");
			
			int inches = input.nextInt(); 
			
			int yards= inches /36;
			int inchesf = inches % 36; 
			int feet= inchesf /12;
			int inchest= inchesf % 12; 
			
			System.out.println("The total number of yards is" + yards);
		    System.out.println("The total number of feet is"  + feet); 
		    System.out.println("The total number of inches"   + inchest); 
			}
			
			

		


	}


