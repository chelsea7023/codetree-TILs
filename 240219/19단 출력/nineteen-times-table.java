import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 20; i++){
            for(int j = 1; j < 20; j++){
                if(j%2 == 0){
                    System.out.print(i + " * " + j + " = " + i*j);
                    System.out.println();
                }else if(j == 19){
                    System.out.print(i + " * " + j + " = " + i*j);
                    System.out.println();
                }else{
                    System.out.print(i + " * " + j + " = " + i*j + " / ");
                }
            }
        }
    }
}