package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Is "+"__"+"a leap year?");
		int year = in.nextInt();
		Boolean divisible4 = (year %4 ==0);
		Boolean divisible100 = (year%100!=0);
		Boolean divisible400 = (year%400==0);
		Boolean leap = (divisible4 && divisible100)||(divisible400);
		System.out.print(year +" is a leap year: "+ leap);
	}

}
