import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = n - i; j > 0; j--){
                System.out.print((char)cnt + " ");
                cnt ++;
                if((int)'Z' + 1 == cnt){
                    cnt = 65;
                }
            }
            System.out.println();
        }
    }
}