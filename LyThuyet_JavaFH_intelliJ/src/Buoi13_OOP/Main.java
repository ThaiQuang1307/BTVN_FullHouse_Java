package Buoi13_OOP;


// "this" là từ khóa tượng trưng cho đối tượng hiện tại.
/* 4 phạm vi truy cập:
 * Class:
	+ public: cho phép được dùng ở mọi nơi
	+ default: chỉ cho phép dùng trong cùng 1 package
 * Các thành phần trong class:
  	+ public: cho phép được dùng ở mọi nơi
	+ default: chỉ cho phép dùng trong cùng 1 package
	+ protected: tương tự default
	+ private: chỉ cho phép dùng các thành phần trong class của nó
*/


public class Main {
	
	public static void main(String[] args) {
		
//		Student s = new Student("Le Dao Tan Thanh", "12451", 12);
//		Student s = new Student("Le Dao Tan Thanh");
//		s.info();
//		System.out.println(s);
//		System.out.println(s.show());
//		System.out.println();
		
//		Student s1 = new Student("ABC", "123123", 22);
//		System.out.println(s1);
//		System.out.println(s1.show());
		
//		Person p = new Person("LE DAO TAN THANH", "1892451", 22);
//		p.name = "abc";
//		p.id = "000";
//		p.age = 111;
//		p.info();
		
		Management m = new Management(3);
		Student my_student = new Student("LE DAO TAN THANH", "123", 12);
		m.add(my_student);
		m.add(new Student("LE DAO TAN THANH", "123", 12));
//		m.add(new Student("alksdvbkajsdbv", "123", 12));
//		m.add(new Student("iausbdviuasbdv", "123", 12));
//		m.add(new Student("LE DAO TAN THANH", "123", 12));
//		m.add(new Student("LE DAO TAN THANH", "123", 12));
		m.print();
		
	}

}