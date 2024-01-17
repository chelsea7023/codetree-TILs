import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String a = sc.next();
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(a+"-"+y+"-"+x);
    }
}