package Buoi16_OOP;


public class Person {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void run() {
		System.out.println(this.name + " đang chạy");
	}

}
