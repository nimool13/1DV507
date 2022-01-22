package ns222tv_assign3;

import java.util.Scanner;

public class PascalMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row number that should be printed: ");

		while (true) {
			try {

				while (!scanner.hasNextInt()) {
					System.err.println("input is invalid");
					scanner.next();
				}

				int rowNumber = scanner.nextInt();
				printPascal(rowNumber);

			}

			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public static void printPascal(int n) {
		for (int i = 0; i < n; i++) {
 			for (int j = 0; j <= i; j++) {
				if (i + 1 == n)
					System.out.print(calculatePascal(i, j) + " ");
			}
		}
	}

	public static int calculatePascal(int i, int j) {
		if (j == 0) {
			return 1;
		} else if (j == i) {
			return 1;
		} else {
			return calculatePascal(i - 1, j - 1) + calculatePascal(i - 1, j);
		}

	}
}
