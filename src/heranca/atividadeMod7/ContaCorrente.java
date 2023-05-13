package heranca.atividadeMod7;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double limiteChequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public double getSaldo() {
        return this.chequeEspecial + this.saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
        } else {
            if(valor > getLimiteSaque()){
                System.out.println("Saque não efetuado! Saldo insuficiente.");
            }else {
                this.saldo -= valor;
                this.chequeEspecial += this.saldo;
                this.saldo = 0;
                System.out.println("O cheque especial foi utilizado nessa transação!");
            }
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    private double getLimiteSaque(){
        return this.saldo + this.limiteChequeEspecial;
    }

    @Override
    public void depositar(double valor) {
      this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }
}
