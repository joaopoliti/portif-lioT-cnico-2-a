import javax.swing.JOptionPane;

class Main {
String mensagem;
String nome;
int seusTurnos;
int turnosAdversario;
  public static void main(String[] args) {
   Main m = new Main();
   m.truco();

  }
  public void truco (){
    if( nome == null){
nome = JOptionPane.showInputDialog("Digite seu nome!");
 }
seusTurnos = Integer.parseInt(JOptionPane.showInputDialog(nome+", Digite seu turnos!"));
turnosAdversario = Integer.parseInt(JOptionPane.showInputDialog(nome+", Digite seu turnos!"));

if(seusTurnos == 0 && turnosAdversario == 0 ){
  mensagem = nome+", A partida não acabou!";
  JOptionPane.showInputDialog(null, mensagem);
  truco();
   }
   else if(seusTurnos == 1 && turnosAdversario == 0 ){
     mensagem = nome+" Você está na frente, porém a partida não acabou!";
     JOptionPane.showInputDialog(null, mensagem);
     truco();
   }
    else if(seusTurnos == 0 && turnosAdversario == 1 ){
     mensagem = nome+" Você está atrás, porém a partida não acabou!";
     JOptionPane.showInputDialog(null, mensagem);
     truco();
   }
     else if(seusTurnos == 2 ){
     mensagem = nome+" Você venceu!";
     JOptionPane.showInputDialog(null, mensagem);
     truco();
   }
    else if(turnosAdversario == 2 ){
     mensagem = nome+" Você perdeu!";
     JOptionPane.showInputDialog(null, mensagem);
     truco();
   }
    else if(seusTurnos == 1 && turnosAdversario == 1 ){
     mensagem = nome+" Voces estão empatados, bora vencer!";
     JOptionPane.showInputDialog(null, mensagem);
     truco();
   }
  }
}
