import java.util.Arrays;
import java.util.Scanner;

public class problem10818 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
           arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]+" "+arr[N-1]);
        s.close();
    }
}
