import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int[] cnt = new int[1001];
        for(int i = 0; i < N; i++){
            cnt[arr[i]]++;
        }
        int max = 0;
        for(int i = 1; i <= 1000; i++){
            if(cnt[i] == 1){
                if(max < i){
                    max = i;
                }
            }
        }
        if(max == 0){
            System.out.print(-1);
        }else{
            System.out.print(max);
        }
    }
}