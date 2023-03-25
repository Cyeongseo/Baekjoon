import java.util.Scanner;

public class problem2920 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[8];
        String r="";
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]==arr[i]+1){
                r="ascending";
            }
            else if(arr[i+1]==arr[i]-1){
                r="descending";
            }
            else{
                r="mixed";
                break;
            }
        }
        System.out.println(r);
        s.close();
    }
}
