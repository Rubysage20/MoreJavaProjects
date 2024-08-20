/**
 * 
 */
package lab2;

/**
 *
 * Name:Valerie Dawson
 * Overview: This program displays the average age of three different ages.
 * Input: Three Different Ages
 * Output: Average
 * Variables: Age1,Age2,Age3
 *
 */
import java.util.Scanner;
public class AverageAge {

	
	public static void main(String[] args) {
	int age1;
	int age2;
	int age3;
	double average;
	Scanner scan = new Scanner(System.in);
	//get three ages from the user
	System.out.println("Enter three ages and I will compute their average.");
	// ask the user for the first age ( two instructions)
	System.out.println("Enter the first age:");
	age1 = scan.nextInt();
	// ask the user for the second age (two instructions)
	System.out.println("Enter the second age:");
	age2 = scan.nextInt();
	// ask the user for the third age (two instructions)
	System.out.println("Enter the third age:");
	age3 = scan.nextInt();
	// compute the average 
	System.out.println("The Average is " + ( age1 +  age2  + age3) /3f);
	// print the average(note decimals in the display)
	

	}

}
