package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListsFun {

	public static void main(String[] args) {
		
		System.out.println("Experiment 1: add to ArrayList end - presized vs default");
		
		long startTime = System.nanoTime();
		
		ArrayList<Integer> listA = new ArrayList<Integer>();
		for(int i = 0; i < 1_000_000; i++) {
			listA.add(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		
		ArrayList<Integer> listB = new ArrayList<Integer>(1_000_000);
		for(int i = 0; i < 1_000_000; i++) {
			listB.add(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 2: add to LinkedList end");
		
		startTime = System.nanoTime();
		LinkedList<Integer> listC = new LinkedList<Integer>();
		for(int i = 0; i < 1_000_000; i++) {
			listC.add(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 3: sequential access");
		
		startTime = System.nanoTime();
		for (Integer i : listB) {
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (Integer i : listC) {
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 4: random access");
		
		ArrayList<Integer> indexes = new ArrayList<Integer>(9999);
		for(int i=0; i<10_000; i++) {
			indexes.add((int)(Math.random() * 10_000));
		}
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listA.get(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listC.get(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 5: random remove");
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listA.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listC.remove(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		System.out.println("\nExperiment 6: indexOf");
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listA.indexOf(i);
		}
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i : indexes) {
			listC.indexOf(i);
		}
		System.out.println(System.nanoTime() - startTime);
	}
}
