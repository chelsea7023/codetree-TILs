import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        for(int i = str.length() - 1; i > str.length() - 12; i--){
            System.out.print(str.charAt(i));
        }
    }
}