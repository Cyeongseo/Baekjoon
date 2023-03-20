import java.util.Scanner;

public class problem4998 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(true){
            double N=s.nextDouble();
            double B=s.nextDouble();
            double M=s.nextDouble();
            int t=1;
            while(true){
                N+=N*B/100;
                if(N<=M){
                    System.out.println(t);
                    break;
                }
                else{
                    t++;
                }
            }
        }

    }
}
