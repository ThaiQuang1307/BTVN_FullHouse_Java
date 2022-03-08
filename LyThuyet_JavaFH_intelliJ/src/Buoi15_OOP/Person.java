package Buoi15_OOP;


public /*final*/ class Person {
	
//	public final int hang_so;
	protected String name;
	String id;

	public Person(String name, String id) /*Phương thức khởi tạo đầy đủ tham số*/ {
//		this.hang_so = hang_so;
		this.name = name;
		this.id = id;
	}
	
	public /*final*/ void info() {
		System.out.println("Tên: " + this.name);
		System.out.println("Id: " + this.id);
	}

}
