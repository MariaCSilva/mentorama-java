package heranca;

public class ContaPoupanca extends Conta {
    private  int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.taxaJuros * this.saldo;
    }
}
