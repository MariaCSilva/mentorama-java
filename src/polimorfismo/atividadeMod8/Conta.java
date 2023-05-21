package polimorfismo.atividadeMod8;

public abstract class Conta {
    private int numero;
    private int agencia;
    private Banco banco;
    private Cliente cliente;
    protected double saldo;

    public Conta(int numero, int agencia, Banco banco, Cliente cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    abstract boolean sacar(double quantia);
}
