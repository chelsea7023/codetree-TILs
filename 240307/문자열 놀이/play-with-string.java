import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            if(sc.nextInt() == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char[] arr = str.toCharArray();
                char A = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = A;
                str = String.valueOf(arr);
                System.out.println(str);
            }else{
                char[]arr = str.toCharArray();
                char ch = sc.next().charAt(0);
                char ch2 = sc.next().charAt(0);
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == ch){
                        arr[j] = ch2;
                    }
                }
                System.out.println(String.valueOf(arr));
            }

        }
    }
}