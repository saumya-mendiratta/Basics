package lec3;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += pos * (int) Math.pow(10, rem - 1);
			pos++;
			n = n / 10;
		}
		System.out.println(sum);
	}
}