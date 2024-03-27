import javax.swing.JOptionPane;

public class AlunoEx {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual idade do aluno?");
        String datanascimento = JOptionPane.showInputDialog("data de nascimento do aluno?");
        String mae = JOptionPane.showInputDialog("Nome da mãe");

        String disciplina1 = JOptionPane.showInputDialog("Disciplina1");
        String nota1 = JOptionPane.showInputDialog("digite a primeira nota?");

        String disciplina2 = JOptionPane.showInputDialog("Disciplina2");
        String nota2 = JOptionPane.showInputDialog("Digite a segunda nota?");

        String disciplina3 = JOptionPane.showInputDialog("Disciplina3");
        String nota3 = JOptionPane.showInputDialog("Digite a terceira nota?");

        String disciplina4 = JOptionPane.showInputDialog("Disciplina4");
        String nota4 = JOptionPane.showInputDialog("Digite a quarta nota?");

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setIdade(Integer.valueOf(idade));
        aluno.setDataNascimento(datanascimento);
        aluno.setMae(mae);

        

        System.out.println("O nome do aluno é: " +aluno.getNome());
        System.out.println("A idade dele(a) é: " +aluno.getIdade() + " anos");
        System.out.println("A data de nascimento é: " +aluno.getDataNascimento());
        System.out.println("Nome da mãe é: "+aluno.getMae());
        /*System.out.println("nota1 é: " + aluno.getNota1());
        System.out.println("nota2 é: " + aluno.getNota2());
        System.out.println("nota3 é: " + aluno.getNota3());
        System.out.println("nota4 é: " + aluno.getNota4());*/
        System.out.println("Media da nota é: " +aluno.getMediaNota());
        System.out.println("Resultado = " +(aluno.getAlunoAprovado()? "Aprovado" : "reprovado"));
        System.out.println("Resultado 2 = " +aluno.getAlunoAprovado2());
    }
     
    
}
