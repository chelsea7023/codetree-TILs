import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int cnt = 0;
        int num = 0;
        int min = Integer.MAX_VALUE;
        boolean success = false;
        while(cnt < A.length()){
            cnt++;
            A = A.substring(A.length() - 1, A.length()) + A.substring(0, A.length() - 1);
            if(A.equals(B)){
                num = cnt;
                if(min > num){
                    min = num;
                }
                success = true;
            }
        }
        if(success){
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}