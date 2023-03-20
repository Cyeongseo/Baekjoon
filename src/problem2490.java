import java.util.Scanner;

public class problem2490 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String []yut=new String[3];
        int []num=new int[4];
        for(int i=0;i<yut.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                num[j]=s.nextInt();
                if(num[j]==1)count++;
            }
            if(count==0){
                yut[i]="D";//윷
            }
            else if(count==1){
                yut[i]="C";//걸
            }
            else if(count==2){
                yut[i]="B";//개
            }
            else if(count==3){
                yut[i]="A";//도
            }
            else if(count==4){
                yut[i]="E";//모
            }
        }
        for(int i=0;i< yut.length;i++){
            System.out.println(yut[i]);
        }
        s.close();
    }
}
