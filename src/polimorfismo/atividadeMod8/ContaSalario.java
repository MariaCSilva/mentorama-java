package polimorfismo.atividadeMod8;

public class ContaSalario extends Conta {
    private int limiteSaque;
    private int quantidadeSaque;

    public ContaSalario(int numero, int agencia, Banco banco, Cliente cliente, double saldo, int limiteSaque) {
        super(numero, agencia,banco,cliente, saldo );
        this.limiteSaque = limiteSaque;
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
            if(verificaQuantidaSaque()){
                this.saldo -=  valor;
                quantidadeSaque++;
                return true;
            }
        }
        return false;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    private boolean verificaQuantidaSaque() {
        if(quantidadeSaque < limiteSaque){
            return true;
        }else{
            System.out.println("Saque não realizado! Você pode executar apenas "+quantidadeSaque+" saque(s)");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                '}';
    }
}
