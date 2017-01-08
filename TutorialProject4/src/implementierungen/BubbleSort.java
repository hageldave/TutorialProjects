package implementierungen;

import schnittstellen.ISort;

public class BubbleSort implements ISort{

	@Override
	public int[] sort(int[] toSort) {
		for(int i = 0; i < toSort.length; i++){
			for(int j = toSort.length-1; j > 0; j--){
				if(toSort[j] < toSort[j-1]){
					int backup = toSort[j];
					toSort[j] = toSort[j-1];
					toSort[j-1] = backup;
				}
			}
		}
		return toSort;
	}

}
