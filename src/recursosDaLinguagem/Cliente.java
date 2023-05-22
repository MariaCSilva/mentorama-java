package recursosDaLinguagem;

public class Cliente implements Authenticator {
private String nome;
private boolean status;
private int compras;
private String senha;

    public Cliente(String nome, boolean status, String senha, int compras) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                ", compras=" + compras +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean autentica(String senha) {
        if(!this.senha.equals(senha)){
            System.out.println("Não autenticado!");
            return false;
        }

        System.out.println("Autenticado!");
        return true;
    }
}
