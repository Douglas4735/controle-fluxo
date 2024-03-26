import java.util.List;

public class Aluno {
    
    String nome;
    int idade;
    String dataNascimento;
    String mae;
    double nota1;
    double nota2;
    double nota3;
    double nota4;

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
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public double getNota4() {
        return nota4;
    }
    /*Metodo que retorn a media do aluno */
    public double getMediaNota(){
        return (nota1 + nota2 + nota3 + nota4)/4;
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
}
