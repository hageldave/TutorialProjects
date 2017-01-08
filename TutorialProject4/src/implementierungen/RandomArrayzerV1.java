package implementierungen;

import schnittstellen.IArrayGenerator;

public class RandomArrayzerV1 implements IArrayGenerator{

	@Override
	public int[] getArray(int numOfElements) {
		int[] array = new int[numOfElements];
		for(int i = 0; i< numOfElements; i++){
			array[i] = (int) ((Math.random()*numOfElements*2)-numOfElements);
		}
		return array;
	}


}
