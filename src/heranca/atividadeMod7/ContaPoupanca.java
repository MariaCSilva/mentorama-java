package heranca.atividadeMod7;

import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double getSaldo() {
        if(Calendar.DAY_OF_MONTH == diaAniversario){
            return this.saldo + this.taxaJuros * this.saldo;
        }else {
            return this.saldo;
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor <= getSaldo()){
            this.saldo = getSaldo() - valor;
        }else {
            System.out.println("Saque não efetuado! Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}
