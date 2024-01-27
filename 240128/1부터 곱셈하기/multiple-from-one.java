import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for(int i = 1; i<=10; i++){
            x *= i;
            if (x<n){
                continue;
            }else if (x>=n) {
                System.out.println(i);
                break;
            }
        }
    }
}