package Buoi17_OOP;

public class Main {
    public static void main(String[] args) {

//        Student s= new Student("thai quang");
//        s.greeting();
//        Person.greeting();
//        s.eat();

//        Person s = new Student("Quang");
//        s.eat();
//        s.greeting();

//        Student s = new Student("quang");
//        s.abc();
//        Student.abc();

//        A object = new A();
//        object.phuongThuc1();

//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Double[] arr1 = {4.2, 1.2, 4.3};

//        print(arr);
//        print(arr1);

//        print(arr, arr1);

        Student[] arr = new Student[3];
        arr[0] = new Student("Trinh");
        arr[1] = new Student("Dung");
        arr[2] = new Student("Quang");
        print(arr);

    }

    static <T> void print(T[] arr){
        for (T i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    // T là kiểu dữ liệu dạng class
//    static <T1, T2> void print(T1[] arr1, T2[] arr2) {
//        for (T1 i : arr1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (T2 i : arr2) {
//            System.out.print(i + " ");
//        }
//    }

//    static void print(int[] arr) {
//        for (int i :
//                arr) {
//            System.out.println(i + " ");
//        }
//        System.out.println();
//    }

//    static void print(double[] arr){
//        for (double i :
//                arr) {
//            System.out.println(i + " ");
//        }
//    }
}
