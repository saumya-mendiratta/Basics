package LEC1;

import java.util.Scanner;

public class hollowrhombus {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		
		int nst =n;
		int nsp=n-1;
		int row=1;
		
		while(row<=n){
			int csp=1;
			int cst=1;
		
		
		while(csp<=nsp){
			System.out.print(" ");
			csp++;
		}
		while(cst<=nst){
			if (row==1 || row==n)
				System.out.print("*");
			else if(cst==1 || cst==nst)
			System.out.print("*");
			else
				System.out.print(" ");
			cst++;
		}
		
		
		System.out.println();
		
		
		if(nst==row)
			break;
		nsp--;
		row++;
		}
	}
		}


