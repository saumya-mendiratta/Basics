
package LEC1;

import org.omg.Messaging.SyncScopeHelper;

public class pattern21 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = (2*n)-3;
		int nst = 1;

		while (row <= n) {
			int csp = 1, cst = 1;

			while (cst <= nst) {
				// cst=1;
				System.out.print("*");
				cst = cst + 1;
			}
			while (csp <= nsp) {
				// csp=1;
				System.out.print(" ");
				csp++;

			}
			
			cst = 1;
			while (cst <= nst) {
				// cst=1;
				if(cst<n)
				System.out.print("*");
				
				cst = cst + 1;
			}
			System.out.println();

			row++;
			
			nst++;
			
			nsp -= 2;
		}
	}

}
