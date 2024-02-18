import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 1;
        for(int i = 0; i < N; i++){
            for(int j = i; j <= 2*i; j++){
                System.out.print(cnt + " ");
                cnt ++;
                
            }System.out.println();
        }
    }
}