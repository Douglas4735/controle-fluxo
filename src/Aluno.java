import java.util.List;

public class Aluno {
    
    String nome;
    int idade;
    String dataNascimento;
    String mae;

    // Eu parei aqui no Array das disciplinas
    
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

     
     public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
            return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setMae(String mae) {
        this.mae = mae;
    }
    public String getMae() {
        return mae;
    }
    
}
