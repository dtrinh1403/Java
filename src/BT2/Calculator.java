package BT2;

public class Calculator {

    public static int Sum(int soNguyen1, int soNguyen2){
        int sumSoNguyen = soNguyen1 + soNguyen2;
        return sumSoNguyen;
    }

    public static float Product(float soThuc1, float soThuc2){
        float tichSoThuc = soThuc1 * soThuc2;
        return tichSoThuc;
    }
    public static void main(String[] args) {
        System.out.println("Tong 2 so nguyen: "+ Sum(100, 200));
        System.out.println("Tich 2 so thuc: "+ Product(1.2f, 2.4f));
    }
}
