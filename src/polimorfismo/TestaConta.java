package polimorfismo;

public class TestaConta {

    public static void main(String[] args) {
        Conta contas[] = new Conta[3];

        ContaCorrente cc = new ContaCorrente(22,1,"Banco AA",100.00,1000.00);
        ContaPoupanca cp = new ContaPoupanca(22,1,"Banco AA",100.00,20, 0.05);
        ContaSalario cs = new ContaSalario(22,1,"Banco AA",1000.00,3);
        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;
        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        System.out.println("Saldo atual: R$ " + cp.getSaldo(25));
    }
}
