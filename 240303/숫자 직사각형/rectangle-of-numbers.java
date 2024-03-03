import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n, m; 
        n = sc.nextInt();
        m = sc.nextInt();
        int cnt = 1;
        int[][] num = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                num[i][j] = cnt;
                cnt++; 
            }
            
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(num[i][j] + " ");
            }System.out.println();
        }
    }
}