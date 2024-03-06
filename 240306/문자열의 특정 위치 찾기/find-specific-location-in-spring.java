import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        int n = str.indexOf(a);
        if(n == -1){
            System.out.println("No");
        }else{
            System.out.println(n);
        }
    }
}