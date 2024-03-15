import javax.swing.JOptionPane;

public class AlunoEx {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual idade do aluno?");
        String datanascimento = JOptionPane.showInputDialog("data de nascimento do aluno?");
        String mae = JOptionPane.showInputDialog("Nome da mãe");

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setIdade(Integer.valueOf(idade));
        aluno.setDataNascimento(datanascimento);
        aluno.setMae(mae);

        System.out.println("O nome do aluno é: " +aluno.getNome());
        System.out.println("A idade dele(a) é: " +aluno.getIdade() + " anos");
        System.out.println("A data de nascimento é: " +aluno.getDataNascimento());
        System.out.println("Nome da mãe é: "+aluno.getMae());
    }
     
    
}
