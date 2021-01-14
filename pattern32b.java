package LEC1;

public class pattern32b {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int start=1;

		while (row <= 2*n-1) {
			 int val=row;
			int csp = 1, cst = 1;
			if(row<n)
			while (cst <= nst) {
				if(cst%2==0)
				System.out.print("*");
				else
					System.out.print(val);
				cst++;
			}
			
			System.out.println();

			row++;
			if (row <= n) {
				//nsp--;
				nst+=2;
				start++;
			} else {
				//nsp++;
				nst-=2;
				start--;
			}
		}

	}
}
