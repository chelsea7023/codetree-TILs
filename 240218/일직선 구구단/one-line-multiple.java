import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}