package lab2;
/*
 * Name:Valerie Dawson
 * Overview: This program display Hamza age
 * Input: faizon's current age
 * Output: Hamza age
 * Variables: fazianAge and hamzaAge
 */
import java.util.Scanner;
public class HamzaAge {

	public static void main(String[] args) {
		int faizanAge = 0;
		int hamzaAge = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("What is Faizan's current age? ");
		faizanAge = scan.nextInt();
		hamzaAge = (faizanAge *3)-5;
		System.out.println("If Faizan is "  + faizanAge +" then Hamza must be " + hamzaAge + ".");

	}

}
