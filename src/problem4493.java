import java.util.Scanner;

public class problem4493 {
    public static int Game(String p1,String p2){
        int r1=0,r2=0;
        int rr;
        if(p1.equals('R')){
            if(p2.equals('S'))r1++;
            else if(p2.equals('P'))r2++;
        }
        else if(p1.equals('S')){
            if(p2.equals('R'))r2++;
            else if(p2.equals('P'))r1++;
        }
        else if(p1.equals('P')){
            if(p2.equals('R'))r1++;
            else if(p2.equals('S'))r2++;
        }
        if(r1>r2)rr=3;
        else if(r1<r2)rr=2;
        else rr=1;
        return rr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int n=s.nextInt();
        String p1,p2;
        for(int i=0;i<t;i++) {
            for(int j=0;j<n;j++){
                p1=s.next();
                p2=s.next();
            }
        }
    }
}
