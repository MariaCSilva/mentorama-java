package polimorfismo.atividadeMod8;

import polimorfismo.Conta;
import polimorfismo.ContaCorrente;
import polimorfismo.ContaPoupanca;
import polimorfismo.ContaSalario;

public class TestaConta {

    public static void main(String[] args) {
        polimorfismo.Conta contas[] = new Conta[3];

        polimorfismo.ContaCorrente cc = new ContaCorrente(22,1,"Banco AA",100.00,1000.00);
        polimorfismo.ContaPoupanca cp = new ContaPoupanca(22,1,"Banco AA",100.00,20, 0.05);
        polimorfismo.ContaSalario cs = new ContaSalario(22,1,"Banco AA",1000.00,3);
        contas[0] = cc;
        contas[1] = cp;
        contas[2] = cs;
        System.out.println(cp);
        cp.depositar(400);
        System.out.println(cp);
        System.out.println("Saldo atual: R$ " + cp.getSaldo(25));
    }
}
