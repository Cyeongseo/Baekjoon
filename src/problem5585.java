import java.awt.*;
import java.util.Scanner;

public class problem5585 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int Money=s.nextInt();
        Money=1000-Money;
        int M=0;
        int i=0;
        M=Money/500;
        i+=M;
        Money-=M*500;

        M=Money/100;
        i+=M;
        Money-=M*100;

        M=Money/50;
        i+=M;
        Money-=M*50;

        M=Money/10;
        i+=M;
        Money-=M*10;

        M=Money/5;
        i+=M;
        Money-=M*5;

        M=Money/1;
        i+=M;

        System.out.print(i);
        s.close();
    }
}
