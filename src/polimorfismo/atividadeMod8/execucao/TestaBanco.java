package polimorfismo.atividadeMod8.execucao;

import polimorfismo.atividadeMod8.Banco;

import java.util.HashMap;
import java.util.Map;

public class TestaBanco {

    static  Map<String, Banco> bancos = new HashMap<>();
    public static void main(String[] args) {
       Entrada entrada = new Entrada();
       entrada.criarBanco(bancos);
       entrada.criarContaCorrente(bancos);
    }
}
