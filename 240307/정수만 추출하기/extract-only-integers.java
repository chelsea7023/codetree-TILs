import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int num1 = str.length();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) < 48 || str.charAt(i) > 57){
                num1 = i;
                break;
            }
        }
        str = str.substring(0, num1);
        int num2 = str2.length();
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) < 48 || str2.charAt(i) > 57){
                num2 = i;
                break;
            }
        }
        str2 = str2.substring(0, num2);
        System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));

    }
}