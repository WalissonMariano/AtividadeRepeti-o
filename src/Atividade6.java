import javax.swing.JOptionPane;
public class Atividade6 {
    public static void main(String[] args) {
        int opcaoSexo;
        int qtdMac;
        int qtdFem;
        int idade;
        int idadeMasc;
        int idadeFem;

        qtdFem = 0;
        qtdMac = 0;
        idadeMasc = 0;
        idadeFem = 0;

        for (int cont=0 ;cont<4 ;cont++){
           //Escolher gênero
            String [] sexo = {"Masculino" , "Feminino"};
            opcaoSexo = JOptionPane.showOptionDialog(null,"Selecione o seu sexo: ",
                    "Gênero", 0, JOptionPane.QUESTION_MESSAGE,null, sexo,"Masculino");

            if (opcaoSexo==0){
                //Masc
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
                idadeMasc = idadeMasc + idade;
                qtdMac++;
            } else if (opcaoSexo == 1) {
                //Fem
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
                idadeFem = idadeFem + idade;
                qtdFem++;

            }
        }
        JOptionPane.showMessageDialog(null, "Foram registrados "+ qtdMac +
                " Homens, com idade média de " + (idadeMasc/qtdMac) + " anos."
                + "\nForam registradas "+ qtdFem + " Mulheres, com idade média de "+ (idadeFem/qtdFem) + " anos.");
    }
}
