package Buoi16_OOP;


public class Student extends Person {
	
	public String id;

	public Student(String name, int age, String id) {
		super(name, age);
		this.id = id;
	}
	
	public void play() {
		System.out.println(super.name + " đang chơi");
	}

}
