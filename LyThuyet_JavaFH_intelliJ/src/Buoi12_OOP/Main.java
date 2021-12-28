package Buoi12_OOP;

public class Main {
    public static void main(String[] args) {
        // Ten_class ten_doi_tuong = new Ten_class();

//        Student stu = new Student();
//        stu.ten = "Trinh thai quang";
//        stu.id = "aaaaaa";
//        stu.namSinh = 2001;
//        stu.chuyenNganh = "cntt";
//        stu.lop = "cntt03";
//        stu.ngayThangNamSinh = "13/07/2001";
//
//        System.out.println(stu.ten);
//        System.out.println(stu.id);
//        System.out.println(stu.namSinh);
//        System.out.println(stu.lop);
//        System.out.println(stu.chuyenNganh);
//        System.out.println(stu.ngayThangNamSinh);

//        Student a = new Student();

//        System.out.println(a.id);
//        System.out.println(a.name);
//        System.out.println(a.age);
//        a.homework("21:50");

//        Student a = new Student("quang", "aaaaa", 2001);
//        a.name = "le thanh";
//        a.info();
//
//        Student b = new Student("thai", "bbbbb", 2002);
//        b.info();

//        Student a = new Student("quang", "aaaaa", 2001);
//        Student b = a;
//        a.info();
//        b.info();
//        System.out.println();
//        a.name = "le thanh";
//        a.info();
//        b.info();

//        Student a = new Student("quang", "aaaaa", 2001);
//        Student b = a.saochep();
//        a.info();
//        b.info();
//        System.out.println();
//        a.name = "le thanh";
//        a.info();
//        b.info();

        // Code class Student gồm:
        // 3 thuộc tính: name, id, age
        // 1 phương thức khởi tạo để định nghĩa 3 thuộc tính trên theo thứ tự
        // 1 phương thức tên là sosanh(), nhận vào 1 tham số là 1 đối tượng
        // student khác và có chức năng trả về True nếu ID của đối tượng
        // student đầu vào trùng với id của đối tượng hiện tại, ngược lại trả về False

        Student stu1 = new Student("ABC", "123456", 20);
        Student stu2 = new Student("XYZ", "123456", 21);
        Student stu3 = new Student("DEF", "1234", 32);
        System.out.println(stu1.sosanh(stu2));
        System.out.println(stu1.sosanh(stu3));


    }
}
