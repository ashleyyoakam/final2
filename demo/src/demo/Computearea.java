package demo;

import java.util.Scanner;

public class Computearea {
	public static void main(String[] args) {
		
//creates scanner object
		Scanner input = new Scanner(System.in);
		
//reads radius
		System.out.print("Enter radius");
		double radius=input.nextDouble();
		
		//compute area
		double area=radius*radius*3.14159;
		
// display result
		System.out.print("Area is: "+area);
		}
}