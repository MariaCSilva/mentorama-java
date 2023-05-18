package polimorfismo.atividadeMod8;

public class ContaSalario extends Conta implements Tributavel {
    public static final int LIMITE_SAQUE = 4;
    private int quantidadeSaque;

    public ContaSalario(int numero, int agencia, Banco banco, Cliente cliente, double saldo) {
        super(numero, agencia,banco,cliente, saldo );
    }

    @Override
    public double getSaldo() {
        this.saldo = saldo - saldo * getImposto();
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

    @Override
    public double getImposto() {
        if(getSaldo() > 4664.68){
            return 27.5;
        }else {
            if(getSaldo() > 3751.05){
                return 22.5;
            }else{
              if (getSaldo() >  2826.65){
                  return 15.0;
                }else {
                  return 0.0;
              }
            }
        }
    }
}
