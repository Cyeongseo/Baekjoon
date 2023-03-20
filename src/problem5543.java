import java.util.Scanner;

public class problem5543 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int burgar=2001;
        int drink=2001;
        for(int i=0;i<3;i++){
            int b=s.nextInt();
            if(b<burgar){
                burgar=b;
            }
        }
        for(int i=0;i<2;i++){
            int d=s.nextInt();
            if(d<drink){
                drink=d;
            }
        }
        System.out.println(burgar+drink-50);
        s.close();
    }
}
