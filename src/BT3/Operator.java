package BT3;

public class Operator {
    static int num1 = 300;
    static int num2 = 200;
    static int num3 = 300;

    static final int number = 100;
    public static void soSanh(int n){
        if (n == number){
            System.out.println("n = 100");
        } else if (n < number) {
            System.out.println("n < 100");
        }
        else {
            System.out.println("n > 100");
        }
    }
    public static void main(String[] args) {
        if ((num1 < num2) && (num2 < num3)){
            System.out.println("num1 < num3");
        } else if ((num1 > num2) && (num2 > num3)) {
            System.out.println("num1 > num3");
        } else if ((num1 == num3) || (num1 - num3 == 0)){
            System.out.println("num1 = num3");
        }
        soSanh(101);
    }
}
