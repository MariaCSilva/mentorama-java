package heranca.atividadeMod7;

public class ContaSalario extends Conta {
    private int limiteSaque;
    private int quantidadeSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
        quantidadeSaque = 0;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {

    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                ", quantidadeSaque=" + quantidadeSaque +
                '}';
    }
}
