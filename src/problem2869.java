import java.util.Scanner;

public class problem2869 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double A=s.nextInt();
        double B=s.nextInt();
        double V=s.nextInt();
        int t=(int)Math.ceil(((V-B)/(A-B)));
        System.out.print(t);
        s.close();
    }
}
