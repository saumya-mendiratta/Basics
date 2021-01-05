package LEC1;

import java.util.Scanner;

public class hollow_diamond{

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		
		int nst =n;
		int nsp=0;
		int row=1;
		
		while(row<=(2*n)-1){
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
		//if(row==1 || row==2*n-1 )
		//	nst--;
		while(cst<=nst){
			if(row==2*n-1 && cst==nst )
				System.out.print(" ");
			else
			System.out.print("*");
			cst++;
			
		}
		System.out.println();
		row++;
		if(row<=n)
		{nst--;
		if(row==2)
		nsp+=1;
		else
			nsp+=2;}
		else 
		{nst+=1;
		if(row==2*n-1)
		nsp-=1;
		else
			nsp-=2;
		//row++;
		}
		}

	}

}
