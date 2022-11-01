import javax.swing.*;

public class Atividade10 {
    public static void main(String[] args) {
        double numero;
        double razao;
        double fibo;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        razao = 1;

        for (int cont = 0;cont<numero;cont++ ){

            if (cont==0){
                System.out.println("0");
                System.out.println("1");
            }else if (numero!= 2){
                fibo = (razao-1) + (razao-2);
                System.out.println(fibo);
            }
            razao++;
    }

    }
}
