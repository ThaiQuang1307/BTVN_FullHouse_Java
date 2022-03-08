package Buoi15_OOP;


public class Student extends Person {
	
	public String lop;
	
	public Student(String name, String id, String lop) {
		super(name, id);
		this.lop = lop;
	}
	
//	@Override
//	public void info() { // Ghi đè
//		super.info();
//		System.out.println("Lớp: " + this.lop);
//	}
	
	public void info() {
		System.out.println("Tên: " + super.name);
		System.out.println("Id: " + super.id);
	}

}
