import java.util.Scanner;

public class problem10813 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();//바구니의 개수
        int M=s.nextInt();//교환할 횟수
        int[] basket=new int[N];
        for(int k=0;k<N;k++){
            basket[k]=k+1;
        }
        for(int i=0;i<M;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            int c=basket[a-1];
            basket[a-1]=basket[b-1];
            basket[b-1]=c;
        }
        for(int j=0;j<N;j++){
            System.out.print(basket[j]+" ");
        }
        s.close();
    }
}
