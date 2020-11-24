package LEC1;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int f = scn.nextInt();
		
		int count =0;
		int a;
		while(n>0)
		{
			a=n%10;
			if(f==a)
				count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
