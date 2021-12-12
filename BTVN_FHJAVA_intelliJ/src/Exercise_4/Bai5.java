package Exercise_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        File myFile = new File("my_dictionary.txt");
        if (myFile.createNewFile()){
            System.out.println("File tao thanh cong");
        }else {
            System.out.println("File da ton tai");
        }

        boolean check = true;
        while (check){

            System.out.println("1.Them vao tu dien");
            System.out.println("2.Tim kiem nghia cua tu");
            System.out.println("3.Hien thi file");
            System.out.println("4.Thoat!");
            System.out.println("Nhap lua chon:\t");
            int luaChon = sc.nextInt();
//            sc.close();
            switch (luaChon){
                case 1: {
                    FileWriter fileWriter = new FileWriter("my_dictionary.txt", true);
                    System.out.print("\nNhap tu moi: ");
                    sc.nextLine();
                    String tuMoi = sc.nextLine();
                    System.out.print("\nNhap nghia: ");
                    String nghia = sc.nextLine();
                    fileWriter.write("\n" + tuMoi + ", " + nghia);
                    fileWriter.close();
                }
                case 2:{
                    // tach từ và nghĩa thành 2 mảng đối xứng
                    File phanTach = new File("my_dictionary.txt");
                    Scanner scan = new Scanner(phanTach);
                    ArrayList<String> tu = new ArrayList<String>();
                    ArrayList<String> nghia = new ArrayList<String>();

                    while (scan.hasNext()){
                        String temp = scan.nextLine();
                        String[] arr = temp.split(", ");
                        System.out.println(Arrays.toString(arr));
                        tu.add(arr[0]);
                        nghia.add(arr[1]);
                    }

                    scan.close();
                    System.out.print("\nNhap tu can tim: ");
                    sc.nextLine();
                    String timTu = sc.nextLine();
                    sc.close();

                    int viTri = -1;
                    for (int i = 0; i < tu.size(); i++) {
                        if (timTu.equals(tu.get(i))){
                            viTri = i;
                        }
                        if (viTri > -1) break;
                    }
                    if (viTri == -1){
                        System.out.println("Khong co tu nay trong tu dien");
                    }else {
                        System.out.println("Dich nghia: " + nghia.get(viTri));
                    }

                }
                case 3:{
                    File readFile = new File("my_dictionary.txt");
                    Scanner scan = new Scanner(readFile);
                    System.out.println("Noi dung file");
                    while (scan.hasNext()){
                        System.out.println(scan.nextLine());
                    }
                    scan.close();
                }
                case 4:{
                    check = false;
                    System.out.println("Da thoat..!");
                }
            }
        }
    }

}
