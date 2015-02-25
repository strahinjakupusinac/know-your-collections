package collections;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapsFun {

	public static void main(String[] args) {
		
		Map<Integer, Integer> mapA = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapB = new LinkedHashMap<Integer, Integer>();
		Map<Integer, Integer> mapC = new HashMap<Integer, Integer>(1 << 19);
		Map<Integer, Integer> mapD = new LinkedHashMap<Integer, Integer>(1 << 19);

		
		System.out.println("Experiment 1: put - default capacity");
		
		long startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapA.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapB.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 2: put - predefined capacity");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapC.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapD.put(i, i);
		}
		System.out.println(System.nanoTime() - startTime);		
		
		
		System.out.println("\nExperiment 3: iterate");
		
		startTime = System.nanoTime();
		for (Entry<Integer, Integer> entry : mapA.entrySet()) {
			
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (Entry<Integer, Integer> entry : mapB.entrySet()) {
			
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 4: remove");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapA.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			mapB.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		try {
			Field tableField = HashMap.class.getDeclaredField("table");
			tableField.setAccessible(true);
			Object[] table = (Object[]) tableField.get(mapA);
			System.out.println("mapA capacity after removal: " + (table == null ? 0 : table.length));
			table = (Object[]) tableField.get(mapB);
			System.out.println("mapB capacity after removal: " + (table == null ? 0 : table.length));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
				
	}
}
