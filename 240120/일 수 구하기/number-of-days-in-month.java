// 1,3,5,7,8,10,12 = 31 // 2,4,6,9,11=30 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a<=7&&a%2==1||8<=a&&a<=12&&a%2==0) {
            System.out.println(31);
        }else
            System.out.println(30);
    }
}