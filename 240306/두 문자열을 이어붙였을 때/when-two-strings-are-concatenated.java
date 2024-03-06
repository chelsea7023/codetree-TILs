import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String AB = A+B;
        String BA = B+A;
        boolean success = true;
        for(int i = 0; i < AB.length(); i++){
            if(AB.charAt(i) != BA.charAt(i)){
                success = false;
                break;
            }
        }
        System.out.println(success);
    }
}