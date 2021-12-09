package Exercise_3;

public class Bai11 {

    public static void main(String[] args) {
        System.out.println(convertToBase(123,8));
    }

    static final char[] kitu = { // mang đối chiếu
            '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H',
            'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z','W'
    };

    static String convertToBase(int n, int base){
        String s = "";
        if (n == 0){
            return "0";
        }else {
            int i = 0;
            while (n > 0){  // chia toi khi phan nguyen cua phep chia == 0 thi dung lai
                int soDu = n % base; // lấy phần dư
                n /= base;  // chia lấy nguyên
                s += kitu[soDu]; // gan gia tri tuong ung phan du sau moi lan chia
            }
            s = new StringBuffer(s).reverse().toString();
            return s;
        }
    }

}
