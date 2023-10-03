package everton;

import javax.swing.JOptionPane;


public class Everton {

 
    public static void main(String[] args) {
      String nome;
      int idade;
    nome = (JOptionPane.showInputDialog(null, "digite o nome: "));
    idade = Integer.parseInt(JOptionPane.showInputDialog(null, "digite a idade: "));
    JOptionPane.showMessageDialog(null, "Olá " + nome + " você veio a " + idade + " anos atrás ao mundo");
}
    }
    

