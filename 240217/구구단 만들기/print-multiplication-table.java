import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = 1; i <= 9; i++){
            for(int j = b; j >= a; j-=2){
                System.out.print(j + " * " + i + " = " + i*j);
                if(j <= b && j > a){
                    System.out.print(" / ");
                }
                
            }System.out.println();
        }
    }
}