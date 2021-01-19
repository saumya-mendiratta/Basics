
package LEC1;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class xyz {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row = 1;
		
		int nsp = n-1;
		int nst = 1;

		while (row <=2*n-1) {
			int k=row;
		
			int csp = 1, cst = 1;
			while (csp <= nsp) {
				System.out.print("\t" + " ");
				csp++;
			}
			while (cst <= nst) {
				if(row<=n)
				{
				if(cst<(nst+1)/2){
				System.out.print("\t" +k);
				k++;}
				else if(cst==(nst+1/2))
					System.out.print("\t" +k);
				else 
				{	System.out.print("\t" +k);
				k--;
				}
				}
				else{
					if(cst<(nst+1)/2){
						System.out.print("\t" +(k-2));
						k--;}
						else if(cst==(nst+1/2))
							System.out.print("\t" +k);
						else 
						{	System.out.print("\t" +k);
						k--;
						}
					
				}
				
				cst = cst + 1;
			}
			System.out.println();
			
			row++;
			if (row <= n)
					{
				nsp--;
				nst+=2;
			} else {
				
				nsp++;
				nst-=2;
			}
		}

	}
}
