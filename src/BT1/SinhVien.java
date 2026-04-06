package BT1;

public class SinhVien {

    String name = "Dat"; //instance
    static int age = 26; //static

    public static void main(String[] args) {
        String sport = "basketball"; //local
        SinhVien sinhVien = new SinhVien();

        System.out.println("Name: " + sinhVien.name);
        System.out.println("Age: " + age);
        System.out.println("My sport: " + sport);

        ThongTin info = new ThongTin();
        System.out.println("Major: " + ThongTin.major);
        System.out.println("Graduated: "+ info.year);


    }
}
