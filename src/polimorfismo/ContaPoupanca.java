package polimorfismo;

public class ContaPoupanca extends Conta {
    private  int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    public double getSaldo(int dia) {
        if(dia >= this.diaAniversario){
            return this.saldo + this.taxaJuros * this.saldo;
        }else {
            return this.saldo;
        }

    }

    @Override
    public boolean sacar(double quantia) {
        this.saldo -= quantia;
        return false;
    }

    @Override
    public String toString() {
        return super.toString()+ "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}
