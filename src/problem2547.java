import java.math.BigInteger;
import java.util.Scanner;

public class problem2547 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int p;
        String[]a= new String[T];
        for (int i = 0; i < T; i++) {
            BigInteger sum =new BigInteger("0");
            p = s.nextInt();
            for (int j = 0; j < p; j++) {;
                sum=sum.add(s.nextBigInteger());
            }
            String r=String.valueOf(sum.remainder(BigInteger.valueOf(p)));//remainder=>BigInteger 나머지 구함
            if (r.equals("0"))a[i]="YES";
            else a[i]="NO";
        }
        for(int i=0;i<T;i++){
            System.out.println(a[i]);
        }

        s.close();
    }
}
