import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double custo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a taxa do imposto? ");
        double taxaImposto = sc.nextDouble();
        System.out.println("Qual o custo? ");
        custo = sc.nextDouble();
        double custoFinal = somaImposto(taxaImposto, custo);
        System.out.println("O custo final é: " + custoFinal);
        sc.close();
    }
    public static double somaImposto(double taxaImposto, double custo){
        return custo + (custo * taxaImposto/100);
    }
}
