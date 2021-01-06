package LEC1;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int lcm= Math.max(n1, n2);
		int n = n1*n2;
		while(lcm<=n)
		{
			if(lcm%n2==0 && lcm%n1 ==0)
			break;
			lcm++;
			
	}
		System.out.println(lcm);	
	}

}
