import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem10814 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String [][]p=new String[N][2];
        for(int i=0;i<N;i++){
            p[i][0]=s.next();
            p[i][1]=s.next();
        }
        Arrays.sort(p, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                //양의 정수일때만 두 객체의 위치를 바꿔줌
            }
        });
        for(int i=0;i<N;i++){
            System.out.println(p[i][0]+" "+p[i][1]);
        }
        s.close();
    }
}
