import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 격자 크기 
        int m = sc.nextInt(); // 동전 갯수
        int[][] arr = new int[n][n];
        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r - 1][c - 1] = 1;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    System.out.print(1 + " ");
                }else{
                    System.out.print(0 + " ");
                }
            }System.out.println();
        }

    }
}