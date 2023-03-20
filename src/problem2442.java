import java.util.Scanner;

public class problem2442 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=1;i<=N;i++){
            for(int k=0;k<=N-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
