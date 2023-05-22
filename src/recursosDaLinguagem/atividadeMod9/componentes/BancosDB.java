package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancosDB {
   private static Map<String, Banco> bancos = new HashMap<>();
    private BancosDB() {
    }


    public static void adicionaBanco(Banco banco){
        bancos.put(banco.getNome(), banco);
    }

    public static List<Banco> getBancoList() {
        List<Banco> bancos1 = new ArrayList<>();
        for (Map.Entry<String, Banco> bancoEntry : bancos.entrySet()){
            bancos1.add(bancoEntry.getValue());
        }
        return bancos1;
    }

    public static Banco getBanco(String banco){
        return bancos.get(banco);
    }
    public static boolean bancoExiste(String nome){
        return bancos.get(nome) != null;
    }
}
