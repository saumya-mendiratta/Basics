
package LEC1;

import org.omg.Messaging.SyncScopeHelper;

public class pattern23 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int val=1;
		
		int nsp =n-1 ;
		int nst = 1;

		while (row <=n) {
			int csp = 1, cst = 1;
			while (csp <= nsp) {
				System.out.print("     " + "\t");
				csp++;
			}
			while (cst <= nst) {
				System.out.print(val + "\t");
				val++;
				cst = cst + 1;
			}
			System.out.println();

			row++;
			
				nsp--;
				nst+=2;
			
		}

	}
}
