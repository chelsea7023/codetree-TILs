import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 n값 입력 받기
        int n = scanner.nextInt();

        // n개의 정수 입력 받기
        
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            // 주어진 숫자가 홀수이면서 3의 배수인 경우에만 출력
            if (number % 2 != 0 && number % 3 == 0) {
                System.out.println(number);
            }
        }

        // 스캐너 닫기
        scanner.close();
    }
}