package javagenerics;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>();
		
		intList.add(1);
		intList.add(2);
		
		strList.add("one");
		strList.add("two");
		
		System.out.println("Is empty? " + intList.isEmpty());
		System.out.println("Is empty? " + strList.isEmpty());
		System.out.println("Size of intList: " + intList.size());
		System.out.println("Size of strList: " + strList.size());
		
		intList.addAll(Arrays.asList(3, 4));
		strList.addAll(Arrays.asList("three", "four"));
		
		System.out.println(intList);
		System.out.println(strList);
		
		System.out.println(intList.get(0));
		System.out.println(strList.get(1));
		
		intList.remove(0);
		strList.remove("two");
		
		System.out.println(intList);
		System.out.println(strList);
	}
}
