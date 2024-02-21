import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] ch = new char [10];
        for(int i = 0; i < 10; i++){
            ch[i] = sc.next().charAt(0);
        }
        System.out.println(ch[1] + " " + ch[4] + " " +ch[7] );
    }
}