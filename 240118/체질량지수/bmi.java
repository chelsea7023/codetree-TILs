import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        float c = b*(100*100)/(a*a);
        if(c>=25){
            System.out.printf("%.0f",c);
            System.out.println("\nObesity");
        }else {
            System.out.printf("%.0f",c);
        }
    }
}