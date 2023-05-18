package polimorfismo.atividadeMod8.execucao;

import polimorfismo.atividadeMod8.Banco;
import polimorfismo.atividadeMod8.Conta;

import java.util.HashMap;
import java.util.Map;

public class TestaBanco {

    static  Map<String, Banco> bancos = new HashMap<>();
    public static void main(String[] args) {
       Entrada entrada = new Entrada();

       entrada.criarBanco(bancos);
       String nomeBanco = entrada.lerTexto("Informe o nome do banco: ");
       entrada.criarCliente(bancos,nomeBanco);
       entrada.criarContaCorrente(bancos, nomeBanco);
       entrada.criarContaPoupanca(bancos, nomeBanco);
        Conta o =  bancos.get(nomeBanco).getConta(12);
        Conta d = bancos.get(nomeBanco).getConta(13);
        bancos.get(nomeBanco).transferir(o,d,10.0);
        System.out.println(o);
        System.out.println(d);
        System.out.println(bancos.get(nomeBanco).getSaldoPorBanco());
    }
}
