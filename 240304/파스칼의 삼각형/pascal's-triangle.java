import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        for(int i = 2; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(i == j){
                    arr[i][j] = 1;
                }else if(j == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] != 0){
                    System.out.print(arr[i][j] + " ");
                }
            }System.out.println();
        }
    }
}