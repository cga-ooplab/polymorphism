package javagenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CreatingArrayList2 {

	public static void main(String[] args) {
		ArrayList<Object> objList = new ArrayList<Object>();
		objList.add("Hello");
		objList.add(23.0);
		System.out.println(objList);

		ArrayList<Integer> newIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 2));
		
		Iterator<Integer> iterator = newIntList.iterator();			// This retrieves the next element from the ArrayList using 

		while (iterator.hasNext()) {
		    Integer value = iterator.next();						// value = next element in newIntList
		    if (value.equals(1)) {									// If value == 1, it then removes the current element from the ArrayList.
		        iterator.remove();
		        System.out.println("Removed: " + value);
		    }
		}
		
		for (Integer value : newIntList) {
			System.out.println(value);
		}
	}
}
