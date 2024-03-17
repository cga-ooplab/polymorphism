package school;

public class University {
	
	public static void main(String[] args) {
		// Three types of polymorphism: True, Pseudo/Adhoc, and Parametric polymorphism
		
		// Creating a Student object named Allan
		Student allan = new Student("Allan", 1101025, "BSSTA");
		allan.getProfile(); // Getting the profile of Allan
		
		// Creating a Student object named Jan
		Users jan = new Student("Jan", 1101008, "BSCS");
		jan.getProfile(); // Getting the profile of Jan
		
		// (1) True/Subtype/Inclusion polymorphism: A subclass of a superclass can be
		// used as a substitute for its superclass.
		// Creating an Admin object named Elsa
		Users elsa = new Admin("Elsa", 1101035);
		elsa.getProfile(); // Getting the profile of Elsa
	}
}

class Student extends Users {
	
	// Constructor for Student with name, id, and degree
	public Student(String name, int id, String degree) {
		super(name, id, degree);
	}

	// Method to get the profile of a student
	@Override
	public void getProfile() {
		System.out.println("Student: " + name);
	}
}

class Admin extends Users {
	
	// Constructor for Admin with name and id
	public Admin(String name, int id) {
		super(name, id);
	}
	
	public void getProfile() {
		System.out.println(":P I can't show you this");
	}
}

class Users {
	
	protected String name;
	protected int id;
	protected String degree;
	
	// Constructor for Users with name, id, and degree
	public Users(String name, int id, String degree) {
		this.name = name;
		this.id = id;
		this.degree = degree;
	}

	// Constructor for Users with name and id
	public Users(String name, int id) {
		this.name = name;
		this.id = id;
	}

	// Method to get the profile of a user
	public void getProfile() {
		System.out.println("User: " + name);
	}
	
	// (2) Method overloading gives the illusion of having polymorphism. A
	// method seems capable of taking many forms but in reality, there
	// are just multiple declarations of that method with different
	// parameter(s).
	
	
	public void getProfile(Boolean token) {
		if(token == true) {
			System.out.println("Admin: " + name);
		}else {
			System.out.println("Please check your account");
		}
	}

}
