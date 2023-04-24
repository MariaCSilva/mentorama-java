package vetoresEColecoes.atividadeMod6;

public class Aluno {
    private String nome;
    private String codigo;

    public Aluno( String codigo,String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
