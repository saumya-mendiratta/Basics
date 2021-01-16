package LEC1;

import java.util.Scanner;

public class primes {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i,fact,j;
		 for(i=1; i<=n; i++)
		    {
		        fact=0;
		        for(j=1; j<=i; j++)
		        {
		            if(i%j==0)
		                fact++;
		        }
		        if(fact==2)
		            System.out.println(i);
		    }
}
}