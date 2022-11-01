import java.util.Scanner;
public class Atividade8 {
    public static void main(String[] args) {

        double numero;
        double cont;
        double resto;
        int resultado;


        System.out.println("Digite um numero: ");
        Scanner ler = new Scanner(System.in);
        numero = ler.nextDouble();
        cont = numero;
        resultado = 0;

        if (numero<=100){
            while (cont>0){
                resto = numero%cont;
                if (resto == 0 && cont!=1 && cont != numero){
                    //não é primo
                    resultado = 1;
                    break;
                }else {
                    //é primo
                    resultado =2;
                }
                cont--;
            }
            if (resultado == 1){
                System.out.println("NÃO É PRIMO");
            }else {
                System.out.println("É PRIMO");
            }
        }else {
            System.out.println("Numero invalido!");
        }

    }
}
