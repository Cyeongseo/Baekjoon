import java.util.Scanner;

public class problem15969 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int max=0;
        int min=1000;
        int r;
        for(int i=0;i<N;i++){
            r=s.nextInt();
            if(r>max)max=r;
            if(r<min)min=r;
        }
        System.out.print(max-min);
        s.close();
    }
}
