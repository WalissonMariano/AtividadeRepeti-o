import javax.swing.JOptionPane;
public class Atividade9 {
    public static void main(String[] args) {
        double numero;
        double resultado;
        double contador;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        resultado = numero-1;
        contador = numero -1;

        while (contador>0){
            resultado = numero * resultado;

            if (contador == (numero-1)){
                //se for primeira eu tiro dois
                numero= numero -2;
            }else {
                //se nao eu tiro 1
                numero--;
            }
            contador--;
        }
        JOptionPane.showMessageDialog(null, "O fatorial do numero digitado é: " + resultado + ".");
        }
    }

