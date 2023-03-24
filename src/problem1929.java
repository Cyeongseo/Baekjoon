import java.util.Scanner;

public class problem1929 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int M=s.nextInt();
        int N=s.nextInt();
        int[] arr=new int[N+1];
        for(int i=2;i<=N;i++){
            arr[i]=i;
        }
        for(int i=2;i<=N;i++){
            if(arr[i]==0)continue;
            for(int j=i+i;j<=N;j+=i){
                arr[j]=0;
            }
        }
        for(int i=M;i<=N;i++){
            if(arr[i]!=0)System.out.println(i);
        }
        s.close();
    }
}
