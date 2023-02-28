package TasksOOP.FirstTask;

public class Person {
	public String fullName, age;
	
	public Person() {
		this.fullName = "Ivan";
		this.age = "19";
	}
	public Person(String fullName, String age) {
		this.fullName = fullName;
		this.age = age;
	}
	public void move() {
		System.out.print("The " + fullName + "moves");
	}
	
	public void talk() {
		System.out.print("The" + fullName + "talks");
	}
}
