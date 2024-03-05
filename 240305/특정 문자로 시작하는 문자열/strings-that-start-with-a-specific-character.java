import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0; 
        double sum = 0;
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        char a = sc.next().charAt(0);
        for(int i = 0; i < n; i++){
                if(arr[i].charAt(0) == a){
                    cnt++;
                    sum+= arr[i].length();
                    
                
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f", sum/cnt);

    }
}