package Buoi18_OOP;

import Buoi17_OOP.A;

public class Main {
    public static void main(String[] args) {

//        Management m = new Management();
//        Student s1 = new Student("12345", "thanh");
//        Student s2 = new Student("1234", "quang");
//
//        m.addStudent(s1);
//        m.addStudent(s2);
//        m.print();

//        Management<Student> m = new Management<Student>();
//        Student s1 = new Student("12345", "thanh");
//        Student s2 = new Student("1234", "quang");
//        m.addStudent(s1);
//        m.addStudent(s2);
//        m.print();

        Management<Animal> m = new Management<Animal>();
        Animal s1 = new Animal("Dog", 19);
        Animal s2 = new Animal("Cat", 20);
        m.add(s1);
        m.add(s2);
        m.print();
    }
}
