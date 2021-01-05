package LEC1;

import java.util.Scanner;

public class hollow_diamond_n {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		
		int nst =(n+1)/2;
		int nsp=0;
		int row=1;
		
		while(row<=n){
			int csp=1;
			int cst=1;
		if(row==1)
			cst++;
		while(cst<=nst){
			System.out.print("*");
			cst++;
		}
		while(csp<=nsp){
			System.out.print(" ");
			csp++;
		}
		cst=1;
		
		while(cst<=nst){
			if(row==n && cst==nst )
				System.out.print(" ");
			else
			System.out.print("*");
			cst++;
			
		}
		System.out.println();
		row++;
		if(row<=(n+1)/2)
		{
			nst--;
			//while(row=2;)
			if(row==2)
		nsp+=1;
			else
				nsp+=2;
		}
		else 
		{nst+=1;
		if(row==n-1)
		nsp-=2;
		else
			nsp-=2;
			
		
		}
		}}
}

	


