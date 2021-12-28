package Buoi13_OOP;


public class Person {
	
	// Phạm_vi kiểu_dữ_liệu tên;
	public String name;
	private String id;
	private int age;
	
	public Person(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	// Phạm_vi kiểu_trả_về tên() {}
	public void info() {
		System.out.println("Tên: " + this.name);
    	System.out.println("Id: " + this.id);
    	System.out.println("Tuổi: " + this.age);
	}

}
