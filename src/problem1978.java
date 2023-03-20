import java.util.Scanner;

public class problem1978 {
    static int isPrime(int n){
        if(n==1){
            return 0;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int count=0;
        for(int i=1;i<=N;i++){
            int num=s.nextInt();
            count+=isPrime(num);
        }
        System.out.print(count);
        s.close();
    }
}
