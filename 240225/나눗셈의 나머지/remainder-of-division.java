import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] remain = new int[b];
        while(a > 1){
            int c = a % b;
            remain[c]++;
            a = a / b;
        }
        int sum = 0;
        for(int i = 0; i < b; i++){
            sum += remain[i] * remain[i];
        }
        System.out.println(sum);
    }
}