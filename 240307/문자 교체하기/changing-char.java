import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        char[] arr = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        char a = arr[0];
        char b = arr[1];
        arr2[0] = a;
        arr2[1] = b;
        str2 = String.valueOf(arr2);
        System.out.println(str2);
    }
}