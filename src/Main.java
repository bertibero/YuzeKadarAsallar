import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i=2; i<100; i++){
            int sayi = 0;
            for (int k=2; k<i; k++){
                if(i%k==0)sayi++;
                }
            if(sayi == 0) System.out.print(i+" ");
        }
    }
}