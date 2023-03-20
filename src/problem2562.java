import java.nio.Buffer;
import java.util.Scanner;

public class problem2562 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int max=1;
        int t=0;
        for(int i=0;i<9;i++){
            int num=s.nextInt();
            if(num>max){
                max=num;
                t=i+1;
            }
        }
        System.out.println(max);
        System.out.println(t);
        s.close();
    }
}
