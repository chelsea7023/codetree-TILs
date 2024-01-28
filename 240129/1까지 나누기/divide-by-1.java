import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; true; i++){
            n=n/i;
            if(n>1){
                
                continue;
            }else {
                System.out.println(i);
                break;
                
            }
        }
    }
}