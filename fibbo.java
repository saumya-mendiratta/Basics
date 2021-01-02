package LEC1;

import java.util.Scanner;

public class fibbo {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		int i=3;
		int c=0;
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();

	if(n==1)
		System.out.print(a);
	else if(n==2)
	System.out.println(b);
	else{
	
		while(i<=n)
		{
		c=a+b;
	
		a=b;
		b=c;
		i++;
		}
		System.out.println(c);
		
	}
		}
}

