import javax.swing.JOptionPane;
public class Aividade2Repeticao {
    public static void main(String[] args) {
        int multiplicador;
        multiplicador = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        int[] resultado = new int[11];
if (multiplicador<0 || multiplicador>10){
    JOptionPane.showMessageDialog(null, "Valor inválido!");
}else {
    for (int repeticao = 0; repeticao<11 ; repeticao++){
        resultado[repeticao] = multiplicador*repeticao  ;
    }
    JOptionPane.showMessageDialog(null,
            "Tabuada do " + multiplicador +
                    "\n" +
                    "\n1 X " + multiplicador + " = " + resultado[1] +
                    "\n2 X " + multiplicador + " = " + resultado[2] +
                    "\n3 X " + multiplicador + " = " + resultado[3]  +
                    "\n4 X " + multiplicador + " = " + resultado[4]  +
                    "\n5 X " + multiplicador + " = " + resultado[5]  +
                    "\n6 X " + multiplicador + " = " + resultado[6]  +
                    "\n7 X " + multiplicador + " = " + resultado[7]  +
                    "\n8 X " + multiplicador + " = " + resultado[8]  +
                    "\n9 X " + multiplicador + " = " + resultado[9]  +
                    "\n10 X " + multiplicador + " = " + resultado[10] );
}
    }
}
