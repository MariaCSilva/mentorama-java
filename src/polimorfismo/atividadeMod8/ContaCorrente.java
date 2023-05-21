package polimorfismo.atividadeMod8;

public class ContaCorrente extends Conta implements Tributavel {
    private ChequeEspecial chequeEspecial;

    public ContaCorrente(int numero, int agencia, Banco banco, Cliente cliente, double saldo, ChequeEspecial chequeEspecial) {
        super(numero, agencia, banco, cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public double getSaldo() {
        this.saldo = saldo - getImposto();
        if(chequeEspecial.isHabilitado()) {
            return this.chequeEspecial.getSaldoChequeEspecial() + this.saldo;
        }
        return this.saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return consomeChequeEspecial(valor);
        }
    }
    private double getLimiteSaque(){
        return this.saldo + this.chequeEspecial.getLimiteChequeEspecial();
    }

    private boolean consomeChequeEspecial(double valor){
        if(valor > getLimiteSaque()){
            return false;
        }else {
            this.saldo -= valor;
            this.chequeEspecial.setConsumoChequeEspecial(this.saldo);
            this.chequeEspecial.setSaldoChequeEspecial(this.getSaldo());
            this.saldo = 0;
            System.out.println("O cheque especial foi utilizado nessa transação!");
            return true;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public double getImposto() {
        if (this.saldo > 15000){
            return 0.07 * this.saldo;
        }else{
            return 0.0 * this.saldo;
        }

    }
}
