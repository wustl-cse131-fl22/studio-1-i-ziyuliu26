package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The year is:");
		int yr = in.nextInt();
		boolean leapYear = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0);
		System.out.print(yr + " is a leap year: " + leapYear);
	}

}
