package polimorfismo.atividadeMod8;

public class ContaSalario extends Conta implements Tributavel {
    public static final int LIMITE_SAQUE = 4;
    private int quantidadeSaque;

    public ContaSalario(int numero, int agencia, Banco banco, Cliente cliente, double saldo) {
        super(numero, agencia,banco,cliente, saldo );
    }

    @Override
    public double getSaldo() {
        return this.saldo - getImposto();
    }

    @Override
    public boolean sacar(double valor) {
        if(valor > getSaldo()){
            return false;
        }else {
            if(verificaQuantidadeSaque()){
                this.saldo -=  valor;
                quantidadeSaque++;
                return true;
            }else{
                return false;
            }
        }

    }
    private boolean verificaQuantidadeSaque() {
        return quantidadeSaque <= LIMITE_SAQUE;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + LIMITE_SAQUE +
                '}';
    }

    @Override
    public double getImposto() {
        if(this.saldo > 4664.68){
            return this.saldo * 0.07 ;
        }else {
            return 0.05 * this.saldo;
        }
    }
}
