import javax.swing.JOptionPane;
public class Atividade7 {
    public static void main(String[] args) {
        int opcaoFaixaEtaria;
        float altura;
        float peso;
        float imc;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));

        String [] faixaEtaria = {"Adulto" , "Idoso"};
        opcaoFaixaEtaria = JOptionPane.showOptionDialog(null,"Selecione sua faixa etária: ",
                "Gênero", 0, JOptionPane.QUESTION_MESSAGE,null, faixaEtaria,"Adulto");


        imc = peso/(altura*altura);

        if (opcaoFaixaEtaria == 0){
            //Adulto
            if (imc < 18.5) {
                //BAIXO PESO
                JOptionPane.showMessageDialog(null, "Baixo peso.");
                
            } else if (imc>=18.5 && imc<=24.9) {
                //PESO NORMAL
                JOptionPane.showMessageDialog(null, "Peso normal.");

            } else if (imc>=25 && imc<=29.9) {
                //EXESSO DE PESO
                JOptionPane.showMessageDialog(null, "Exesso de peso.");

            } else if (imc>=30 && imc<=34.9) {
                //OBESIDADE CLASSE 1
                JOptionPane.showMessageDialog(null, "Obesidade classe 1.");

            } else if (imc>=35 && imc<=39.9) {
                //OBESIDADE CLASSE 2
                JOptionPane.showMessageDialog(null, "Obesidade classe 2.");

            } else if (imc>=40) {
                //OBESIDADE DE CLASSE 3
                JOptionPane.showMessageDialog(null, "Obesidade classe 3.");

            }

        }else {
            //Idoso
            if (imc<=22){
                //BAIXO PESO
                JOptionPane.showMessageDialog(null, "Baixo peso.");

            } else if (imc>=22 && imc<27) {
                //ADEQUADO OU EUTROFICO
                JOptionPane.showMessageDialog(null, "Peso adequado ou eutrofico.");


            } else if (imc>=27) {
                //SOBREPESO
                JOptionPane.showMessageDialog(null, "Sobrepeso.");
            }
        }
    }
}
