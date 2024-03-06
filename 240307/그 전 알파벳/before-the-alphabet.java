import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int num = (int)ch;
        if(ch == 'a'){
            System.out.println('z');
        }else{
            System.out.println((char)(num-1));
        }
    }
}