import java.util.Scanner;

public class Problem10262 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][] dice=new int[2][4];
        int[] sum=new int[2];
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                dice[i][j]=s.nextInt();
                sum[i]+=dice[i][j];
            }
        }
        if(sum[0]>sum[1]){
            System.out.println("Gunnar");
        }
        else if(sum[0]<sum[1]){
            System.out.println("Emma");
        }
        else{
            System.out.println("Tie");
        }
        s.close();
    }
}
