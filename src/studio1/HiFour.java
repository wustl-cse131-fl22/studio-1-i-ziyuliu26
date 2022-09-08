package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first name is: ");
		String s0 = in.nextLine();
		System.out.println("The second name is: ");
		String s1 = in.nextLine();
		System.out.println("The third name is: ");
		String s2 = in.nextLine();
		System.out.println("The fourth name is: ");
		String s3 = in.nextLine();
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.print("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and "+ s3 + ".");

	}
}
