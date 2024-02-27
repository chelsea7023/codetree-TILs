import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0; 
        
        for(int i = 0; i < 100; i++){
            int a = sc.nextInt();
            if(a == 999 || a == -999){
                break;
            }
            arr[i] = a;
            cnt++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < cnt; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print(max + " ");
        System.out.print(min);
        

    }
}