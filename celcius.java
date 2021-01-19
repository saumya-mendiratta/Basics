package lec3;

import java.util.Scanner;

public class celcius {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		//char ch= scn.next().charAt(0);
		
		
		int minT = scn.nextInt();
		int maxT = scn.nextInt();
		int step = scn.nextInt();
		
		for(int temp=minT;temp<=maxT;temp+=step)
		{
			int c = (5*(temp-32))/9;
			//int c = (int)((5.0/9)*(temp-32));
			System.out.println(temp + " " + c);
		}
		

	}

}
