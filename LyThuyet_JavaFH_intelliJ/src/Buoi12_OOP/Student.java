package Buoi12_OOP;

public class Student {
    // Thuộc tính của Class
    String name;
    String id;
    int age;

    // Phương thức khởi tạo

    public Student() {
    }

    public Student(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    boolean sosanh(Student student){
        if (id.equals(student.id)){
            return true;
        }
        return false;
    }

    // Phương thức xử lý (khá giống với hàm, nhưng không có Static)

    void homework(String time){
        System.out.println(name + " dang lam bai tap luc: " + time);
    }

    void info(){
        System.out.println("Ten " + name);
        System.out.println("MSV: " + id);
        System.out.println("Tuoi: " + age);
    }

    Student saochep(){
        return new Student(name, id, age);
    }

}
