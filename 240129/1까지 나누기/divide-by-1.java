import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; true; i++){
            if(n>i){
                n=n/i;
                continue;
            }else if(n<=i) {
                System.out.println(i);
                break;
                
            }
        }
    }
}