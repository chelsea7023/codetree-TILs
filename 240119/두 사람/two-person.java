import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        if(a>=19&&b=='M'||c>=19&&d=='M'){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        }
}