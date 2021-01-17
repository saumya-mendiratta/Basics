package LEC1;

import java.util.Scanner;

public class reversal {

	public static void main(String[] args) {
		
		
	Scanner scn= new Scanner(System.in);
	//int n=scn.nextInt();
	int a=1234;
	int s=0;
	int n=1234;
	
	while(n>0){
		a=n%10;
		n=n/10;
		s=s*10+a;
				
		
	}
	System.out.println(s);
	}
//	scn.close();
}

