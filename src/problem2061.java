import java.math.BigInteger;
import java.util.Scanner;

public class problem2061 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger K=s.nextBigInteger();
        int L=s.nextInt();
        //int a=K%L;
        int t=0;
        for(int i=2;i<L;i++){
            if((K.remainder(BigInteger.valueOf(i))).compareTo(BigInteger.ZERO)==0){
                t=i;
                break;
            }
        }
        if(t==0){
            System.out.print("GOOD");
        }
        else{
            System.out.print("BAD "+t);
        }
        s.close();
    }
}
