import java.util.Scanner;

public class problem1453 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();//손님의 수
        int[] seat=new int[N];
        int cnt=0;
        for(int i=0;i<N;i++){
            seat[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            int tmp=seat[i];
            for(int j=i+1;j<N;j++){
                if(tmp==seat[j]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.print(cnt);
        s.close();
    }
}
