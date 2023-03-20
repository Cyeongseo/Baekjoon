import java.util.Scanner;

public class problem10708 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();//친구들의 수
        int M=s.nextInt();//게임의 횟수
        int[][] game=new int[M][N];
        int[] target=new int[M];//타겟
        int[] score=new int[N];//점수
        for(int i=0;i<target.length;i++){
            target[i]=s.nextInt();
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                game[i][j]=s.nextInt();
                if(game[i][j]==target[i]){
                    score[j]++;
                }
                else{
                    score[target[i]-1]++;
                }
            }
        }

        for(int i=0;i< score.length;i++){
            System.out.println(score[i]);
        }
        s.close();
    }
}
