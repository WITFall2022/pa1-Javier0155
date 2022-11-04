package edu.wit.cs.comp1000;

// TODO: write your code here
import java.util.Scanner;

public class PA1a {

	public static void main(String[] args) {

		int yards = 0;
		int feet = 0;
		int inches = 0;
		int total = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("enter number of yard in whole numbers");
		yards = input.nextInt();
		System.out.println("enter number of feet in whole numbers");
		feet = input.nextInt();
		System.out.println("enter number of inches in whole numbers");
		inches = input.nextInt();
		total = (yards * 3 * 12) + (feet * 12) + inches;
		System.out.println(total);
	}

}
