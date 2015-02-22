package autoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see Integer#valueOf(int)
 * @see Integer#intValue()
 * @see Integer.IntegerCache
 * 
 * @see ArrayList#remove(int)
 * @see ArrayList#remove(Object)
 */
public class AutoboxingFun {

	public static void main(String[] args) {

		Integer a = new Integer(5);
		Integer b = new Integer(5);

		System.out.println("a == b\t\t" + (a == b));
		System.out.println("a.equals(b)\t" + a.equals(b));

		System.out.println();

		Integer c = 127;
		Integer d = 127;

		System.out.println("c == d\t\t" + (c == d));
		System.out.println("c.equals(d)\t" + c.equals(d));

		System.out.println();

		Integer e = 128;
		Integer f = 128;

		System.out.println("e == f\t\t" + (e == f));
		System.out.println("e.equals(f)\t" + e.equals(f));

		System.out.println();

		Integer g = -128;
		Integer h = -128;

		System.out.println("g == h\t\t" + (g == h));
		System.out.println("g.equals(h)\t" + g.equals(h));

		System.out.println();

		Integer i = -129;
		Integer j = -129;

		System.out.println("i == j\t\t" + (i == j));
		System.out.println("i.equals(j)\t" + i.equals(j));

		System.out.println();

		Long lng = 0L;
		for (int y = 0; y < 1 << 26; y++) { // 1 << 26 aka 2^26 aka 67_108_864
			lng += y;
		}

		System.out.println();

		System.out.println("Sum of even elements: " + sumEven(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
		
		System.out.println();
		
		overloadedMethod(1);
		overloadedMethod(new Integer(1));
		
		int indexA = 0;
		Integer indexB = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(128);
		al.remove(indexA);
		System.out.println("List size: " + al.size());
		
		al.add(128);
		al.remove(indexB);
		System.out.println("List size: " + al.size());

		System.out.println();

		int x = gimmeInteger();
		System.out.println(x);
	}

	// Primitive types can't be null
	public static Integer gimmeInteger() {
		return null;
	}

	// Unboxing
	public static int sumEven(List<Integer> li) {
		int sum = 0;
		for (Integer i : li) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	// Method overloading (ArrayList.remove())
	public static void overloadedMethod(int num) {
		System.out.println("Method with primitive argument");
	}

	public static void overloadedMethod(Integer num) {
		System.out.println("Method with wrapper argument");
	}

}
