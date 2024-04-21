import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String continuar = "S";
        Scanner sc = new Scanner(System.in);

        while(continuar.equalsIgnoreCase("S")){
            int hora, minuto;
            System.out.println("Qual a quantidade de horas?");
            hora = sc.nextInt();
            
            System.out.println("Qual a quantidade de minutos?");
            minuto = sc.nextInt();

            String[] resultado = converteHoras(hora, minuto);
            imprimeHora(resultado[0], resultado[1], resultado[2]);

            System.out.println("Deseja converter outra hora? [S/N]");
            continuar = sc.next();
        }
        sc.close();
    }
    public static String[] converteHoras(int hora, int minuto) {
        String periodo = "A";
        if (hora >= 12){
            periodo = "P";
            hora -= 12;
        }
        String[] resultado = {Integer.toString(hora), Integer.toString(minuto), periodo};
        return resultado;
    }
    public static void imprimeHora(String hora, String minuto, String periodo){
        System.out.println("A hora no formato de 12 horas é: " + hora + ":" + minuto + " " + periodo + ".M ");

    }
}
