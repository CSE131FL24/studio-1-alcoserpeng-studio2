package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("the first of two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.print("the second of two integers to be averaged?");
		double n2 = in.nextDouble();
		double average = (n1+n2)/2;
		System.out.print(average);
	}

}
