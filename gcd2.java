package LEC1;

import java.util.Scanner;

public class gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn= new Scanner(System.in);
		int dividend=scn.nextInt();
		int divisor=scn.nextInt();
		
		int rem ;
		//rem= dividend % divisor;
		while ( dividend % divisor>1 )
		{
			rem= dividend % divisor;
		rem=divisor  ;
		divisor = dividend;
		}
		
		System.out.println(divisor);
		
		
	}

}
