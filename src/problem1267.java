import java.util.Scanner;
public class problem1267 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();  //통화한 개수
        int []call=new int[N];
        int []Ycount=new int[N];
        int []Mcount=new int[N];
        int Ysum=0,Msum=0;
        for(int i=0;i<call.length;i++) {
            call[i]= s.nextInt();
        }
        for(int j=0;j<call.length;j++) {
            int Y=call[j]/30;
            Ycount[j]=(Y+1)*10;
            Ysum+=Ycount[j];
            int M=call[j]/60;
            Mcount[j]=(M+1)*15;
            Msum+=Mcount[j];
        }
        if(Ysum>Msum){
            System.out.println("M "+Msum);
        }
        else if(Ysum<Msum){
            System.out.println("Y "+Ysum);
        }
        else{
            System.out.println("Y M "+Ysum);
        }
        s.close();
    }
}