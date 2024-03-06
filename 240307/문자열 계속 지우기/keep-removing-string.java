import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);;
        String str = sc.next();
        String s = sc.next();
        while(str.contains(s)){
            int num = str.indexOf(s);
            str = str.substring(0, num) + str.substring(num + s.length());
        }
        System.out.println(str);
    }
}