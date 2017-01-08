package programm;

import implementierungen.*;
import schnittstellen.*;

public class Main {
	
	static ISort sorter = new BubbleSort();
	static IArrayGenerator arrayGenerator = new RandomArrayzerV1();

	public static void main(String[] args) {
		int[] array = arrayGenerator.getArray(100000);
		
//		for(int i: array){
//			System.out.println(i);
//		}
		
		long time = System.nanoTime();
		array = sorter.sort(array);
		time = (System.nanoTime() - time);
		
		for(int i: array){
			System.out.println(i);
		}
		
		System.out.println("Zeit zum sortieren: " + time + "ns");
	}
}
