package LEC1;

import java.util.Scanner;

public class problem_with_zeroes {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
	int row,col ;
	for(row =1;row<=n;row++)
	{
		for(col=1;col<=row;col++)
		{	if(col==1|| col==row)
			System.out.print("\t"+row);
		else 
			System.out.print("\t" +"0");
		}
	
	System.out.println();
	}
	}

}
