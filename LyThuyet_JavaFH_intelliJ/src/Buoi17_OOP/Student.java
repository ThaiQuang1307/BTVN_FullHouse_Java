package Buoi17_OOP;

public class Student implements Person{

    public String name;

    public Student(String name){
        this.name = name;
    }

//    public void info(){
//        System.out.println(this.name);
//    }
//
    @Override
    public String toString(){
        return "Doi tuong ten: " + this.name;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " Dang an");
    }

    public static void abc(){
        System.out.println("asdasdasd");
    }
}
