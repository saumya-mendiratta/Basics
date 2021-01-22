package lec3;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();

		int a = 1;
		int sum = 0;
		int k = n;
		int count = 0;

		while (n != 0) {
			count++;
			n = n / 10;
		}
		// System.out.println(count);
		rot=rot%count;
		if(rot<0)
			rot=rot+count;
		while (a <= rot) {
			int b = k % 10;
			sum = b * (int) Math.pow(10, count - 1) + (k / 10);
			k = sum;
			a++;

		}
		System.out.println(sum);

	}
}
