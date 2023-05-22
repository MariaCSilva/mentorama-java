package recursosDaLinguagem.atividadeMod9;

public class Cliente {
    private int id;
    private String nome;
    private boolean status;
    private int compras;

    public Cliente(String nome, boolean status, int compras) {
        this.nome = nome;
        this.status = status;
        this.compras = compras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }


    public Cliente(int compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                ", compras=" + compras +
                '}';
    }
}
