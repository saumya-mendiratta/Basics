package LEC1;

import java.util.Scanner;

public class natural {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
	
		int n=scn.nextInt();
		int a=1,c=0;
		
		
		while (a<=n)
		{
		c+=a;
		a++;
		}
		System.out.println(c);
	}
}
