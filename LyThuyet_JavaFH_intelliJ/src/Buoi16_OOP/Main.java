package Buoi16_OOP;


public class Main {
	
	public static void main(String[] args) {
		
		// Đối tượng: con vật, đồ dùng,...
		// Thực thể: con chó(con vật), con người(con vật), điện thoại(đồ dùng),...
//		Person a = new Person("Thanh", 22); // a là đối tượng của Person và là thực thể của Person
//		Person a = new Student("Thanh", 22, "asjdhasjkv"); // a là đối tượng của Person và là thực thể của Student
//		a.play();
//		Student a = new Student("Thanh", 22, "akjhasdjkv"); // a là đối tượng của Student và là thực thể của Student
//		a.play();
		
//		Person a = new Student("Thanh", 22, "asjdhasjkv"); // Up Casting
//		((Student)a).play(); // Down Casting
//		a.play();
		
//		Server s = new Server();
//		s.rut_tien();
//		s.nap_tien();
		
		ATM s = new Server();
		s.rut_tien();
		s.nap_tien();
		s.xem_thong_tin();
		
	}

}
