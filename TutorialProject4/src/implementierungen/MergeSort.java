package implementierungen;

import schnittstellen.ISort;

public class MergeSort implements ISort{

	@Override
	public int[] sort(int[] array) {
		if (array.length >= 3) {
			int[] left = new int[0];
			int[] right = new int[0];
			left = sort(partof(array, 0, array.length / 2));
			right = sort(partof(array,   array.length / 2 + 1, array.length - 1));

			return merge(left, right);
		} else if (array.length == 2) {
			int[] left = new int[0];
			int[] right = new int[0];
			left = sort(partof(array, 0, 0));
			right = sort(partof(array, 1, 1));

			return merge(left, right);
		} else {
			return array;
		}
	}



	private static int[] merge(int[] L, int[] R) {
		int[] merged = new int[L.length + R.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < L.length && j < R.length) {
			if (L[i] < R[j]) {
				merged[k] = L[i];
				i++;
			} else {
				merged[k] = R[j];
				j++;
			}
			k++;
		}
		if (i == L.length) {
			while (j < R.length) {
				merged[k] = R[j];
				j++;
				k++;
			}
		} else {
			while (i < L.length) {
				merged[k] = L[i];
				i++;
				k++;
			}
		}
		return merged;
	}
	
	private static int[] partof(int[] array, int from, int to)
			throws ArrayIndexOutOfBoundsException {
		int[] newarray = new int[to - from + 1];
		int j = 0;
		for (int i = from; i <= to; i++) {
			newarray[j] = array[i];
			j++;
		}
		return newarray;
	}
}
