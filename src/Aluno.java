

public class Aluno {
    
   private String nome;
   private int idade;
   private String dataNascimento;
   private String mae;

   private AlunoDisciplina disciplina = new AlunoDisciplina();

    public void setAlunoDisciplina(AlunoDisciplina disciplina) {
        this.disciplina = disciplina;
    }
    public AlunoDisciplina getAlunoDisciplina() {
        return disciplina;
    }
   

    // Eu parei aqui no Array das disciplinas
     
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
    
    
    /*Metodo que retorn a media do aluno */
    public double getMediaNota(){
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4())/4;
    }
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70) {
            return true;
        }else{
            return false;
        }
    }
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 70) {
            return "Aluno aprovado";
        }else{
            return "Aluno reprovado";
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
