import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três valores:");
        int a, b, c;
        System.out.println("a:");
        a = sc.nextInt();
        System.out.println("b:");
        b = sc.nextInt();
        System.out.println("c:");
        c = sc.nextInt();
        System.out.println("A soma é: " + soma(a, b, c));
        sc.close();
    }
    public static int soma(int a, int b, int c){
        return a + b + c;
    }
}
