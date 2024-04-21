import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        System.out.println(verifica(num));
        sc.close();
    }
    public static char verifica(int num){
        if(num <= 0 ){
            return 'N';
        }else{
            return 'P';
        }
    }
}
