
package LEC1;

import org.omg.Messaging.SyncScopeHelper;

public class pattern20 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int k=(n-1)/2;
		int nsp = k;
		int nst = 1;

		while (row <=n) {
			int csp = 1, cst = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			System.out.println();

			row++;
			if (row <= (n+1)/2) {
				nsp--;
				nst+=2;
			} else {
				nsp++;
				nst-=2;
			}
		}

	}
}
