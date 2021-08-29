import javax.swing.JOptionPane;

class Main {
String mensagem;
String nome;
int anoNascimento;
int anoAtual;
int idade;

  public static void main(String[] args) {
   Main m = new Main();
   m.idade();

  }
  public void idade (){
    if( nome == null){
nome = JOptionPane.showInputDialog("Digite seu nome!");
 }
anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(nome+", Digite seu ano de nascimento!"));
anoAtual = Integer.parseInt(JOptionPane.showInputDialog(nome+", Digite o ano atual!"));
idade = anoAtual - anoNascimento;
nome = nome+ "sua idade é "+ idade;
  
 JOptionPane.showMessageDialog (null, nome);
  } 
}
