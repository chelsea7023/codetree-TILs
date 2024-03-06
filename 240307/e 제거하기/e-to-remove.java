import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = str.indexOf('e');
        // System.out.println(num);
        str = str.substring(0, num) + str.substring(num + 1);
        System.out.println(str);
    }
}