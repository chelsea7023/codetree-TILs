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
        TC : for(int i = 0; i < n; i++){
            String str = arr[i];
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == a){
                    cnt++;
                    sum+= str.length();
                    continue TC;
                }
            }
        }
        System.out.print(cnt + " ");
        System.out.printf("%.2f", sum/cnt);

    }
}