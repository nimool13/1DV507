package ns222tv_assign2;

/**
 * FunctionPointers.java
 * 13 jan 2017
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author jlnmsi
 *
 */
public class FunctionPointers {

	public static void main(String[] args) {
		System.out.println("Part 1: Apply predicates");
		List<Integer> list = Arrays.asList(45, 3, 24, 16, 1, 1, 3, 8, 7, 6, 10, 12, 17, 22, 30);

		System.out.print("Print all numbers: ");
		Predicate<Integer> all = n -> true;
		selectAndPrint(list, all);                // 

		System.out.print("\nPrint all odd numbers: ");
		Predicate<Integer> odd = new Predicate<Integer>() {
			@Override
			public boolean test(Integer n) {
				return n % 2 != 0;
			}
		};
		selectAndPrint(list, odd);

		System.out.print("\nPrint all numbers greater than 10: ");
		Predicate<Integer> aboveTen = n -> n > 10;
		selectAndPrint(list, aboveTen);

		System.out.println("\n\nPart 2: Apply functions");
		List<Double> numbers = Arrays.asList(1.0, 16.0, 25.0, 81.0);
		System.out.println("Original: "+numbers);
		System.out.println("Square root: "+applyFunction(numbers, a -> Math.sqrt(a)));
		System.out.println("Power of two: " + applyFunction(numbers, new Function<Double, Double>() {
			@Override
			public Double apply(Double d) {
				return powerOfTwo(d);
			}
		}));
	}


	// Prints all elements in the list where predicate evaluates to true
	public static void selectAndPrint(List<Integer> list, Predicate<Integer> predicate) {
		for (var item : list) {
			if (predicate.test(item))
				System.out.print(item + "  ");
		}
	}

	// Returns a new list containing the numbers resulting from applying fx 
	// on the input list numbers
	private static List<Double> applyFunction(List<Double> numbers, Function<Double, Double> fx) {
		List<Double> results = new ArrayList<Double>();
		for (int i = 0; i < numbers.size(); i++) {
			results.add(fx.apply(numbers.get(i)));
		}
		return results;
	}

	private static Double powerOfTwo(Double d) {
		return Math.pow(d, 2);
	}
}
