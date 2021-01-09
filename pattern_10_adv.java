package LEC1;

public class pattern_10_adv {

	public static void main(String[] args) {


		int n = 5;
		int row = 1;
		
		int nsp =0 ;
		int nst = 2*n+1;
		int tst;
		int tsp;
		int dsp=n ;
		
		int dst=1  ;
		
		while (row <=2*n+1) {
			
			int csp = 1, cst = 1;
			if(row<=n)
			{
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("*");
				cst = cst + 1;
			}
			}
			else if(row>n && row<=2*n+1){
			
			 tst=1;
			tsp=1;
			while (tsp <= dsp) {
				System.out.print(" ");
				tsp++;
			}
			while (tst <= dst) {
				System.out.print("*");
				tst = tst + 1;
			}
			dst+=2;
			dsp--;
			}
			System.out.println();

			row++;
			
			
				nsp++;
				nst-=2;
				
			
		}

	}
}
