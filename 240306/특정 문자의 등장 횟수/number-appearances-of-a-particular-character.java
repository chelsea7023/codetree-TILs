import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int cnt = 0; 
        int cnt2 = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+2).equals("ee")){
                cnt++;
            }else if(str.substring(i, i+2).equals("eb")){
                cnt2++;
            }
        }
        System.out.print(cnt + " " + cnt2);
    }
}