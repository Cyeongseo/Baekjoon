import java.util.Scanner;

public class problem2010 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int C=0;
        for(int i=0;i<N;i++){
            int m=s.nextInt();
            C+=m;
        }
        C-=N;
        System.out.print(C+1);
        s.close();
    }
}
