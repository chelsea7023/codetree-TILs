import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(d + " ");
                d = d + 2;
                if(d > 8){
                    d = 2;
                }
            }System.out.println();
        }
    }
}