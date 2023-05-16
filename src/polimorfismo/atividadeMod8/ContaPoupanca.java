package polimorfismo.atividadeMod8;

import java.util.Calendar;

public class ContaPoupanca extends Conta {
    private  int diaAniversario;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, Banco banco, Cliente cliente, double saldo, int diaAniversario, double taxaJuros) {
        super(numero, agencia, banco, cliente, saldo);
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
    public boolean sacar(double valor) {
        this.saldo -= valor;
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
