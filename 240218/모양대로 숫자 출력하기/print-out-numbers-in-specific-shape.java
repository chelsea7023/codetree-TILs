import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i ++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }for(int j = 0; j < N - i; j++){
                System.out.print((N - i-j) + " ");
            }System.out.println();
        }
    }
}