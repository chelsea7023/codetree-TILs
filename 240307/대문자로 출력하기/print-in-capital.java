import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String STR = str.toUpperCase();
        for(int i = 0; i < STR.length(); i++){
            if(STR.charAt(i) >= 'A' && STR.charAt(i) <= 'Z'){
                System.out.print(STR.charAt(i));
            }
        }
    }
}