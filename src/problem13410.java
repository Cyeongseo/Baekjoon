import java.util.Scanner;

public class problem13410 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int num;
        int max=0;
        for(int i=1;i<=K;i++){
            num=N*i;
            int result=0;
            while (num != 0) {
                result = result * 10 + num % 10;
                num /= 10;
            }
            if(result>max){
                max=result;
            }
        }
        System.out.println(max);
        s.close();
    }
}
