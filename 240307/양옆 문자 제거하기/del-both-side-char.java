import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.substring(0, 2) + str.substring(3, str.length() - 2) + str.substring(str.length() - 1, str.length());
        System.out.println(s);
    }
}