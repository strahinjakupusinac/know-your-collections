package arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * @see Arrays
 * @see Arrays#copyOf(int[],int)
 * @see Arrays#sort(int[])
 */
public class ArraysFun {

	public static void main(String[] args) {

		System.out.println("Experiment 1");

		char[] arrayA = { 'c', 'o', 'd', 'e', 'c', 'e', 'n', 't', 'r', 'i', 'c' }; // "codecentric".toCharArray();

		// foreach works for [] too
		for (char c : arrayA) {
			System.out.println(c);
		}

		
		System.out.println("\nExperiment 2");
		
		char[] arrayB = new char[7];
		System.arraycopy(arrayA, 4, arrayB, 0, 7);

		System.out.println(arrayB);

		
		System.out.println("\nExperiment 3");

		Arrays.sort(arrayA);
		
		System.out.println(arrayA);

		
		System.out.println("\nExperiment 4");

		System.out.println(Arrays.binarySearch(arrayA, 'i'));

		
		System.out.println("\nExperiment 5");

		System.out.println(Arrays.hashCode(arrayA));

		
		System.out.println("\nExperiment 6");

		char[][] arrayC = { { 'j', 'a', 'v', 'a' }, { 'r', 'u', 'l', 'e', 's' } };
		System.out.println(Arrays.hashCode(arrayC));
		System.out.println(Arrays.deepHashCode(arrayC));
		
		
		System.out.println("\nExperiment 7");

		// works only for String[]
		String[] arrayD = {"c","o","d","e"};
		Collections.reverse(Arrays.asList(arrayD));
		System.out.println(Arrays.toString(arrayD));
		

	}
}
