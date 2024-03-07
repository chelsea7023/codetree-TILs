import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for(int i = 0; true; i++){
            String str = sc.next();
            if(str.compareTo("END") == 0){
                break;
            }
            char[] arr = str.toCharArray();
            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            System.out.println(String.valueOf(arr));
        }
    }
     
}