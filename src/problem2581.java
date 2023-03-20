import java.util.Scanner;
public class problem2581 {
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int sum=0;
        int min=10001;
        int n=0;
        for(int i=M;i<=N;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    n++;
                }
            }
            if(n==0&&i!=1){
                sum+=i;
                if(min>i){
                    min=i;
                }
            }n=0;
        }
        if(sum==0){
            System.out.println("-1");
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        s.close();
    }
}
