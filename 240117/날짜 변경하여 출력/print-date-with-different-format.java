import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int y, m, d;
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
        System.out.println(m+"-"+d+"-"+y);
    }
}