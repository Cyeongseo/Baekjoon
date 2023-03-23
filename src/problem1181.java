import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem1181 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        String[] word=new String[N];
        for(int i=0;i<N;i++){
            word[i]=s.next();
        }
        Arrays.sort(word, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();//양수면 교환
                }
            }
        });
        System.out.println(word[0]);
        for(int i=1;i<N;i++){
            if(!word[i].equals(word[i-1])){
                System.out.println(word[i]);
            }
        }
        s.close();
    }
}
