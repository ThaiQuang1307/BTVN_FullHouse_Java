package Buoi08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//new
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

//C:\Users\asus\Desktop
public class Main {
    public static void main(String[] args) throws IOException{

        // Tao file

//        File myFile = new File("C:\\Users\\asus\\Desktop\\myNewFile.txt");
//        // createNewFile ()
//        // True neu như tạo thành công
//        //false nếu như đường dẫn đã tồn tại
//        if (myFile.createNewFile()){
//            System.out.println("File da tao thanh cong");
//        }else {
//            System.out.println("File da ton tai");
//        }

        // Ghi vao File
//        FileWriter myFile = new FileWriter("C:\\Users\\asus\\Desktop\\myNewFile.txt");
//        myFile.write("Trinh thai quang");
//        myFile.write("Trinh thai quangadasfadf");
//        myFile.close();

//        FileWriter myFile = new FileWriter("C:\\Users\\asus\\Desktop\\myNewFile.txt", true);
//        myFile.write("\nTrinh thai quang");
//        myFile.close();

        // Doc file
//        File myFile = new File("C:\\Users\\asus\\Desktop\\myNewFile.txt");
//        Scanner sc = new Scanner(myFile);
////        System.out.println(sc.nextLine());
////        System.out.println(sc.nextLine());
//
//        while (sc.hasNext()){
//            System.out.println(sc.nextLine());
//        }
//        sc.close();


        // Xoa file
//        File myFile = new File("C:\\Users\\asus\\Desktop\\myNewFile.txt");
////        myFile.delete();
//        if (myFile.delete()){
//            System.out.println("Xoa thanh cong");
//        }else {
//            System.out.println("File khong ton tai");
//        }

        // Exercise
//        File inputFile = new File("C:\\Users\\asus\\Desktop\\input.txt");
//        Scanner sc = new Scanner(inputFile);
//        String data = sc.nextLine();
//        System.out.println(data);
//        String[] arr = data.split(" ");
//
//        int[] arrInt = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            arrInt[i] = Integer.parseInt(arr[i]);
//        }
//
//        Arrays.sort(arrInt);
//
//        int max = arrInt[arrInt.length-1];
//        FileWriter outputFile = new FileWriter("C:\\Users\\asus\\Desktop\\output.txt");
//        outputFile.write(String.valueOf(max));
//        outputFile.close();
//        sc.close();

        // Dau vao la doc tu file input.txt
        // trong file co 3 so cách nhau bằng dấu khoảng trắng
        // tượng trưng cho 3 cạnh của tam giác
        // Đẩu ra ghi vào file output.txt giá trị của diện thích tam giác

        File inputFile = new File("C:\\Users\\asus\\Desktop\\input.txt");
        Scanner sc = new Scanner(inputFile);
        String data = sc.nextLine();
        String[] arr = data.split(" ");
        double[] tamGiac = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tamGiac[i] = Double.parseDouble(arr[i]);
        }

        double p = (tamGiac[0] + tamGiac[1] + tamGiac[2]) / 2;
        double s = Math.sqrt(p * (p - tamGiac[0]) * (p - tamGiac[1]) * (p - tamGiac[2]));

        FileWriter outputFile = new FileWriter("C:\\Users\\asus\\Desktop\\output.txt");
        outputFile.write(String.valueOf(s));
        outputFile.close();

        sc.close();

    }
}
