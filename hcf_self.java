package LEC1;

import java.util.Scanner;

public class hcf_self {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int gcd= Math.min(n1, n2);
		while(gcd>1){
			if ( n2%gcd==0 && n1%gcd==0)
			{
			//	System.out.println("hcf is "+gcd);
             break;
			}
				gcd--;
		}
		System.out.println("hcf is "+gcd);
	}

}
