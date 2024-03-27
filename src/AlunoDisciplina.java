public class AlunoDisciplina {
    
    /*Essa classe servira para todas as disciplinas */
    private String disciplina;
    private double nota;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
