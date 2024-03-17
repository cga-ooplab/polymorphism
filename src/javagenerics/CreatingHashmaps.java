package javagenerics;

import java.util.HashMap;

public class CreatingHashmaps {
	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("a", "apple");
		maps.put("b", "boy");
		maps.put("c", "cutie");

		System.out.println(maps);
		System.out.println(maps.get("b"));

		HashMap<String, Person> people = new HashMap<String,Person>();
		people.put("JS", new Person("John", "Smith"));
		people.put("AG", new Person("Allan", "Gomez"));

		System.out.println(people.get("JS").getName());
//		System.out.println(people.get("AG").getName());

		System.out.println(people.keySet());

		for(String k: people.keySet()){
			// System.out.println(people.get(k).getName());
			String names = people.get(k).getName();
			if(names.equals("John")) {
				System.out.println(k);
				break;
			}
		}
		
		System.out.println(people.size());
		System.out.println(people.isEmpty());
		System.out.println(people.containsKey("JS")); // Only if JS key actually exist, it returns true. Check line 16
		
		// We will use line no. 7 as example here
		System.out.println(maps.containsValue("apple"));
		
		// For objects, we use this syntax:
		// hashmap_obj.containsValue(Object instance)
		Person personToCheck = new Person("John", "Smith");
        System.out.println(people.containsValue(personToCheck));
	}
}

class Person {
	protected String fname;
	protected String lname;

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	protected String getName() {
		return fname;
	}
}
