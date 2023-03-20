import java.util.Scanner;
import java.util.StringTokenizer;

public class problem1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        StringTokenizer st = new StringTokenizer(word, " ");
        System.out.print(st.countTokens());
        s.close();
    }
}
