package Buoi18_OOP;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student[name=" + this.name + ", age=" + this.age + "]";
    }
}
