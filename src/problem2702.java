import java.util.Scanner;

public class problem2702 {
    public static int GCD(int a,int b){
        while (b>0){
            int temp=a;
            a=b;
            b=temp%b;
        }return a;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int[][] arr=new int[T][2];
        for(int i=0;i<T;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            arr[i][0]=(a*b)/(GCD(a,b)); //a*b=최대*최소
            arr[i][1]=GCD(a,b);
        }
        for(int i=0;i<T;i++){
            System.out.print(arr[i][0]+" ");
            System.out.println(arr[i][1]);
        }
        s.close();
    }
}
