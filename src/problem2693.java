import java.util.Arrays;
import java.util.Scanner;

public class problem2693 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        int[][] arr=new int[T][10];
        for(int i=0;i<T;i++){
            for(int j=0;j<10;j++){
                arr[i][j]=s.nextInt();
            }
            Arrays.sort(arr[i]);
        }

        for(int i=0;i<T;i++){
            System.out.println(arr[i][7]);
        }
        s.close();
    }
}
