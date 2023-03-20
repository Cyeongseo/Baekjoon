import java.util.Scanner;

public class problem4949 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a;
        StringBuilder sb=new StringBuilder();//변경 가능한 문자열을 만들어 준다.
        while(true){
            a=s.nextLine();
            if(a.equals(".")){
                break;
            }
            sb.append(solve(a)).append('\n');//append(연결하고자 하는 문자)
        }
        System.out.println(sb);
        s.close();
    }
    public static String solve(String s){
        char[] stack=new char[s.length()];
        int size=0;
        for(char c:s.toCharArray()){//for(A:B) B에서 차례대로 객체를 꺼내서 A에 넣음
            if(c=='('||c=='['){
                stack[size]=c;
                size++;
            }
            else if(c==')'){
                if(size==0||stack[size-1]!='('){
                    return "no";
                }
                else{
                    size--;
                }
            }
            else if(c==']'){
                if(size==0||stack[size-1]!='['){
                    return "no";
                }
                else{
                    size--;
                }
            }
        }
        if(size!=0){
            return "no";
        }
        else{
            return  "yes";
        }
    }
}
