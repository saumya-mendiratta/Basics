
package LEC1;

import org.omg.Messaging.SyncScopeHelper;

public class pattern_16 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = n;

		while (row <= 2*n-1) {
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
			if (row <= n) {
				nsp--;
				nst--;
			} else {
				nsp++;
				nst++;
			}
		}

	}
}
