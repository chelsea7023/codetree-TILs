import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String newStr = "";
        String newStr2 = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57){
                newStr += str.charAt(i);
            }
        }
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) >= 48 && str2.charAt(i) <= 57){
                newStr2 += str2.charAt(i);
            }
        }
        System.out.println(Integer.parseInt(newStr) + Integer.parseInt(newStr2));
    }
}