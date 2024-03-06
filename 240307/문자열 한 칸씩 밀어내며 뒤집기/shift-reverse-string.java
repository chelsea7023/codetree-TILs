import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            if(a == 1){
                str = str.substring(1, str.length()) + str.substring(0, 1);
            }else if(a == 2){
                str = str.substring(str.length() - 1, str.length()) + str.substring(0, str.length() - 1);
            }else{
                char[] arr = str.toCharArray();

                int start = 0; 
                int end = arr.length - 1;
                
                while(start < end){
                    char tmp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = tmp;
                    
                    start++;
                    end--;
                }
                str = String.valueOf(arr);
            }
            System.out.println(str);
        }
    }
}