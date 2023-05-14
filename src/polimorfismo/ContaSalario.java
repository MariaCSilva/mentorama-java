package polimorfismo;

public class ContaSalario extends Conta {
    private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean sacar(double quantia) {
        if(quantia > saldo){
           return false;
        }else{
           if(this.limiteSaque>0){
               this.limiteSaque--;
               this.saldo -= quantia;
               return true;
           }else {
               System.out.println("Limite de saque excedido");
               return false;
           }
        }
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaSalario{" +
                "limiteSaque=" + limiteSaque +
                '}';
    }
}
