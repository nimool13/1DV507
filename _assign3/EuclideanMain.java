package ns222tv_assign3;


import java.util.Scanner;

public class EuclideanMain {

	public static void main(String[] args) {    
		
		Scanner scanner = new Scanner(System.in);


		
			try {
				System.out.print("Enter M");
				while (!scanner.hasNextInt()) {
					System.err.println("input is invalid");
					scanner.next();
				}

				int M = scanner.nextInt();

				System.out.print("Enter N");
				while (!scanner.hasNextInt()) {
					System.err.println("input is invalid");
					scanner.next();
				}

				int N = scanner.nextInt();
				System.out.println(gcd(N, M));
			}

			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}


	            

	
	
	public static int gcd (int n, int m) {

	    if (m > n) {
	      if ((m % n) == 0) 
	         return n;
	      else
	         return gcd(n, m % n);
	    }
	    else {
	        if ((n % m) == 0) 
	             return m;
	          else
	             return gcd(m, n % m);
	    }
	}

}
