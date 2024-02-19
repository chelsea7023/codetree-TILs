import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(yaksu(i)){
                cnt++;
            }
        }System.out.println(cnt);
    }

    static boolean yaksu(int a){
        boolean answer = false;
        int cnt = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                cnt++;
            }
        }
        if(cnt == 3){
            answer = true;
        }return answer;
    }
}