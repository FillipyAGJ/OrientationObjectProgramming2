package Exercicios.provaFinal.questao09;


public class Professor extends Pessoa{
    private boolean ministrandoAula;
    private int siape;
    private Disciplina disciplinas;

    public void ministrarAula() {
        if (!ministrandoAula) {
            ministrandoAula = true;
        } else {
            ministrandoAula = false;
        }
    }

    public boolean isMinistrandoAula() {
        return ministrandoAula;
    }

    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public Disciplina getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }
}
