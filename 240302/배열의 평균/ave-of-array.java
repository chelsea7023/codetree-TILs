import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[] arrRow = new int[4];
        int[] arrColumn = new int[2];
        

        for(int i = 0; i < 2; i++){
            arrRow = arr[i];
            double sum = 0;
            for(int j = 0; j < 4; j++){
                sum += arrRow[j];
            }
            System.out.printf("%.1f", sum/4);
            System.out.print(" ");
        }
        System.out.println();
        for(int i = 0; i < 4; i++){
            double sum2 = 0;
            for(int j = 0; j < 2; j++){
                sum2 += arr[j][i];
                
            }
            System.out.printf("%.1f", sum2/2);
            System.out.print(" ");
        }
        System.out.println();
        double sum3 = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <4; j++){
                sum3 += arr[i][j];
                
            }
        }
        System.out.printf("%.1f", sum3/8);
        
    }
}