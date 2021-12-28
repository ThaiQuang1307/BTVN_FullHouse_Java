package Buoi13_OOP;


public class Student {
	
	private String name;
	private String id;
	private int age;
	
	public Student(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	public void info() {
		System.out.println("Tên: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Tuổi: " + this.age);
	}

}
