import java.util.Scanner;

public class problem2441 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<N-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
