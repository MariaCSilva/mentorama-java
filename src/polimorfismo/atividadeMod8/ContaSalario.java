package polimorfismo.atividadeMod8;

public class ContaSalario extends Conta {
    public static final int LIMITE_SAQUE = 4;
    private int quantidadeSaque;

    public ContaSalario(int numero, int agencia, Banco banco, Cliente cliente, double saldo) {
        super(numero, agencia,banco,cliente, saldo );
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= getSaldo()){
            System.out.println("Saldo insuficiente!! ");
            return false;
        }else {
            if(verificaQuantidadeSaque()){
                this.saldo -=  valor;
                quantidadeSaque++;
                return true;
            }else{
                System.out.println("Saque não realizado! Você pode executar apenas "+quantidadeSaque+" saque(s)");
                return false;
            }
        }

    }
    private boolean verificaQuantidadeSaque() {
        if(quantidadeSaque > LIMITE_SAQUE){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + LIMITE_SAQUE +
                '}';
    }
}
