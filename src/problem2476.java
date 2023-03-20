import java.util.Scanner;

public class problem2476 {
    public static int Game(int a, int b,int c){
        int max=a;
        int price = 0;
        if(b>max){
            max=b;
            if(c>max)max=c;
        }
        if(a==b&&b==c){
            price=10000+a*1000;
        }
        else if(a==b)price=1000+a*100;
        else if(b==c)price=1000+b*100;
        else if(c==a)price=1000+c*100;
        else price=max*100;
        return price;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int a,b,c;
        int[] person=new int[N];
        for(int i=0;i<N;i++){
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            person[i]=Game(a,b,c);
        }
        int max=person[0];
        for(int i=1;i<N;i++){
            if(person[i]>max)max=person[i];
        }
        System.out.print(max);
        s.close();
    }
}
