import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int max = Math.max(str.length(), Math.max(str2.length(), str3.length()));
        int min = Math.min(str.length(), Math.min(str2.length(), str3.length()));

        System.out.println(max - min);
    }
}