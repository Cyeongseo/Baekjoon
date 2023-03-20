import java.util.Scanner;

public class problem2711 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();//테스트 케이스의 개수
        StringBuffer[] st=new StringBuffer[T];//창영이가 친 문자열
        for(int i=0;i<T;i++){
            int index=s.nextInt();
            StringBuffer sb=new StringBuffer();
            String a=s.next();
            sb.insert(0,a);
            st[i]=sb.delete(index-1,index);
            }
        for(int i=0;i<T;i++){
            System.out.println(st[i]);
        }
        s.close();
        }

    }

