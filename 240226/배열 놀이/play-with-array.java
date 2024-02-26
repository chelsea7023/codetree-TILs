import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[]arr = new int[n];


        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int min = 0;
        int num = 0;

        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            
            if(a == 1){
                int b = sc.nextInt();
                System.out.println(arr[b - 1]);
            }else if(a == 2){
                int b = sc.nextInt();
                num = 0;
                min = Integer.MAX_VALUE;
                for(int j = 0; j < n; j++){
                    if(arr[j] == b){
                        num = j;
                        if(min > num){
                            min = num;
                        }
                    }
                }
                System.out.println(min + 1);
            }else{
                int b = sc.nextInt();
                int c = sc.nextInt();
                for(int j = b - 1; j < c; j++){
                    System.out.print(arr[j] + " ");
                }

            }
        }
    }
}