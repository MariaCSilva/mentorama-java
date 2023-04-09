package vetoresEColecoes.atividadeMod6;

import java.util.Date;

public class Presenca {

    private boolean presenca;
    private Aluno aluno;


    public Presenca(boolean presenca, Aluno aluno, Date data) {
        this.presenca = presenca;
        this.aluno = aluno;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
