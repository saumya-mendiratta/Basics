package lec3;

import java.util.Scanner;

public class bianry_to_decimal {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int mux=1;
		
		int ans =0;
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
		
		ans+=rem*mux;
		mux=mux*2;
		}
		
		System.out.println(ans);
		
		

	}

}
