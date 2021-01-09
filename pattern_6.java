package LEC1;


public class pattern_6 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;

		while (row <= n) {
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
			nsp += 2;
			nst--;
		}

	}
}