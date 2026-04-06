package BT4;

public class ForLoop {
    public static void main(String[] args) {
        int soChan[] = new int[26];


        for (int i = 0; i <= 50; i+=2 ) {
            if (i % 2 == 0){
                soChan[i / 2] = i;
            }
        }
        for (int i : soChan) {
            System.out.print(i + " ");
        }
    }
}
