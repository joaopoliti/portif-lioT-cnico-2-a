Código de hoje:
Classe Aluno:
public class Aluno {

    int idade;
    String nome;
    String cpf;
    String nMatricula;

    public Aluno(int idade, String nome, String cpf, String nMatricula) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.nMatricula = nMatricula;
    }
}

Classe AulaObjeto:
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AulaObjeto {

    ArrayList<Aluno> chamada = new ArrayList<>();

    public static void main(String[] args) {
        AulaObjeto ao = new AulaObjeto();
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade!"));
        for(int i = 0; i<quantidade; i++){
            ao.novoAluno();
        }        
        ao.exibe();
    }

    public void novoAluno() {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade!"));
        String nome = JOptionPane.showInputDialog("Digite o nome!");
        String cpf = JOptionPane.showInputDialog("Digite o CPF!");
        String nMatricula = JOptionPane.showInputDialog("Digite o número de matrícula!");
        Aluno a = new Aluno(idade, nome, cpf, nMatricula);
        chamada.add(a);
    }

    public void exibe() {
        String mensagem = "Alunos:\n\n";
        for (Aluno a : chamada) {
            mensagem += "Nome: " + a.nome + "\n";
            mensagem += "Idade: " + a.idade + "\n";
            mensagem += "CPF: " + a.cpf + "\n";
            mensagem += "Matrícula: " + a.nMatricula + "\n";
            mensagem += "---------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
