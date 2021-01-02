package LEC1;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int c = 9;
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (a < n / 2) {
			
			if (n % a == 0) {
				c = 1;
				break;
			}

			
			
			a++;

		}
		if (c == 1)
			System.out.println("  not prime");
		else
			System.out.println("prime");

	}

}
