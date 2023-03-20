import java.util.Scanner;

public class problem25628 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        A=A/2;
        int b=0;
        while (true){
            if(A>=1&&B>=1){
                b++;
                A--;
                B--;
            }
            else break;
        }
        System.out.print(b);
        s.close();
    }
}
