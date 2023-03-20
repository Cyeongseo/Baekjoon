import java.util.Scanner;

public class problem10093 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long A=s.nextLong();
        long B=s.nextLong();
        if(A>B){
            System.out.println(A-B-1);
            for(long i=B+1;i<A;i++){
                System.out.print(i+" ");
            }
        }
        if(A<B){
            System.out.println(B-A-1);
            for(long i=A+1;i<B;i++){
                System.out.print(i+" ");
            }
        }
        if(A==B){
            System.out.println(0);
        }
        s.close();
    }
}
