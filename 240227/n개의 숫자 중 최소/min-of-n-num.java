import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        final int INT_MAX = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]arr = new int[N];

        int min = INT_MAX;
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
        }
        

        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(arr[i] == min){
                cnt++;
            }
        }
        System.out.print(min + " " + cnt);
    }
}