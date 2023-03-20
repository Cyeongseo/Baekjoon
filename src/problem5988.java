import java.math.BigInteger;
import java.util.Scanner;

public class problem5988 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] result=new String[N];
        for(int i=0;i<N;i++){
            BigInteger K=s.nextBigInteger();
            if(K.remainder(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO)==0){
                result[i]="even";
            }
            else{
                result[i]="odd";
            }
        }
        for (int i=0;i<N;i++){
            System.out.println(result[i]);
        }
        s.close();
    }
}
