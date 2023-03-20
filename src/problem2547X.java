import java.util.Scanner;

public class problem2547X {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int p, n;
        for (int i = 0; i < T; i++) {
            int sum = 0;
            p = s.nextInt();
            for (int j = 0; j < p; j++) {
                n = s.nextInt();
                sum += n;
            }
            if (sum % p == 0) System.out.println("YES");
            else System.out.println("NO");
            s.close();
        }
    }
}
