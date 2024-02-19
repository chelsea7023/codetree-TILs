import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(sosu(i)){
                System.out.print(i + " ");
            }
        }
        
    }

    static boolean sosu(int a){
        boolean answer = false;
        int cnt = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                cnt++;
            }
        }if(cnt == 2){
            answer = true;
        }return answer;
    }
}