import java.util.Scanner;

public class problem12780 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String H;
        String N;
        int index=-1;
        int cnt=0;
        H=s.nextLine();
        N=s.nextLine();
       while(index!=0&&index<=H.length()){
           index=H.indexOf(N,index);//indexOf("찾을 특정 문자","시작할 위치")
           if(index!=-1){           //특정 문자열 찾지 못했을 경우 -1반환
               cnt++;
           }
           index++;
       }System.out.println(cnt);
    }
}
