package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsFun {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> mapA = new HashMap<Integer, Integer>(1 << 14);
		Map<Integer, Integer> mapB = new LinkedHashMap<Integer, Integer>(1 << 14);

		
		System.out.println("Experiment 1: put");
		
		long startTime = System.nanoTime();
		for (int i = 0; i < 10_000; i++) {
			mapA.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10_000; i++) {
			mapB.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 2: iterate");
		
		startTime = System.nanoTime();
		for (Entry<Integer, Integer> entry : mapA.entrySet()) {
			
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (Entry<Integer, Integer> entry : mapB.entrySet()) {
			
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 3: remove");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10_000; i++) {
			mapA.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10_000; i++) {
			mapB.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
	}
}
