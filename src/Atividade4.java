import javax.swing.JOptionPane;
public class Atividade4 {
    public static void main(String[] args) {
        int repeticao;
        repeticao = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da piramide: "));
        String teste = "*";
        if (repeticao>20 || repeticao<0){
            //nao pode
            JOptionPane.showMessageDialog(null, "Tamanho invalido!");
        }else {
            for (int cont = 0 ; cont< repeticao; cont++){
                System.out.println(teste);
                teste = teste+ " *";
            }
        }

    }
}
