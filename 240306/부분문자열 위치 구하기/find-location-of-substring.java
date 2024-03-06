import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i+str2.length()).equals(str2)){
                int n = str.indexOf(str2);
                if(min > n){
                    min = n;
                }
            }
        }

        System.out.println(min);
    }
}