import java.util.Scanner;

public class problem6550 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){//hasNext()는 boolean타입으로 반환
            String[] st=sc.nextLine().split(" ");
            String[] s=st[0].split("");
            String[] t=st[1].split("");
            int idx=0;
            String answer="Yes";
            for(int i=0;i<s.length;i++) {
                boolean r = false;
                for (int j = idx; j < t.length; j++) {
                    if (s[i].equals(t[j])) {
                        idx=j+1;
                        r = true;
                        break;
                    }
                }
                if (!r) {
                    answer = "No";
                    break;
                }
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
