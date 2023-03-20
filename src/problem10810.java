import java.util.Scanner;

public class problem10810 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();//바구니 개수
        int M=s.nextInt();//테스트 수
        int[] basket=new int[N];
        for(int i=0;i<M;i++){
            int first=s.nextInt();
            int end=s.nextInt();
            int ball=s.nextInt();
            for(int j=first-1;j<=end-1;j++){
                basket[j]=ball;
            }
        }
        for(int i=0;i<N;i++){
            System.out.print(basket[i]+" ");
        }
        s.close();
    }
}
