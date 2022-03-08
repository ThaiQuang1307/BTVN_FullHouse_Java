package Buoi14_OOP;


public class Student {
	
	public static String bien_class = "Đây là thành phần static";
	
	public String thuoc_tinh_1;
	String thuoc_tinh_2;
	protected String thuoc_tinh_3;
	private String thuoc_tinh_4;
	
	public Student() {}
	
	Student(String thuoc_tinh_1, String thuoc_tinh_2) {
		this.thuoc_tinh_1 = thuoc_tinh_1;
		this.thuoc_tinh_2 = thuoc_tinh_2;
	}
	
	protected Student(String thuoc_tinh_1, String thuoc_tinh_2, String thuoc_tinh_3) {
		this(thuoc_tinh_1, thuoc_tinh_2);
		this.thuoc_tinh_3 = thuoc_tinh_3;
	}
	
	private Student(String thuoc_tinh_1, String thuoc_tinh_2, String thuoc_tinh_3, String thuoc_tinh_4) {
		this(thuoc_tinh_1, thuoc_tinh_2, thuoc_tinh_3);
		this.thuoc_tinh_4 = thuoc_tinh_4;
	}
	
	public static void ptxl_1() {
		System.out.println("Đây là phương thức xử lý 1");
		System.out.println();
	}
	
	void ptxl_2() {
		System.out.println("Đây là phương thức xử lý 2");
	}
	
	protected void ptxl_3() {
		System.out.println("Đây là phương thức xử lý 3");
	}
	
	private void ptxl_4() {
		System.out.println("Đây là phương thức xử lý 4");
	}

}
