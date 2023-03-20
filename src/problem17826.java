import java.util.Scanner;

public class problem17826 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] OS=new int[50];
        for(int i=0;i<50;i++){
            OS[i]=s.nextInt();
        }
        int score=s.nextInt();
        for(int i=0;i<50;i++){
            if(OS[i]==score){
                score=i+1;
                break;
            }
        }
        if(score>=1&&score<=5){
            System.out.println("A+");
        }
        else if(score>=6&&score<=15){
            System.out.println("A0");
        }
        else if(score>=16&&score<=30){
            System.out.println("B+");
        }
        else if(score>=31&&score<=35){
            System.out.println("B0");
        }
        else if(score>=36&&score<=45){
            System.out.println("C+");
        }
        else if(score>=46&&score<=48){
            System.out.println("C0");
        }
        else{
            System.out.println("F");
        }
        s.close();
    }
}
