import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char a = arr[0];
        char b = arr[1];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                arr[i] = b;
            }else if(arr[i] == b){
                arr[i] = a;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}