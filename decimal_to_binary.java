package lec3;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		
			Scanner scn= new Scanner(System.in);
			int n=scn.nextInt();
			int mux=1;
			
			int ans =0;
			while(n!=0)
			{
				int rem=n%2;
				n=n/2;
			
			ans+=rem*mux;
			mux=mux*10;
			}
			
			System.out.println(ans);
			
			

		}

	


	}


