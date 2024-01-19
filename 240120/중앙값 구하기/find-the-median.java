import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b&&b>c||a<b&&b<c){
            System.out.println(b);
        }else if(b>c&&c>a||b<c&&c<a){
            System.out.println(c);
        }else{
            System.out.println(a);
        }
    }
}