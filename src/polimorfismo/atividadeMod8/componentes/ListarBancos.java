package polimorfismo.atividadeMod8.componentes;

import polimorfismo.atividadeMod8.Banco;

import static polimorfismo.atividadeMod8.componentes.BancosDB.getBancoList;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Constantes.TITULO_LISTA_BANCOS;
import static polimorfismo.atividadeMod8.componentes.Layout.*;

public class ListarBancos implements IOpcao {

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_LISTA_BANCOS);
        for (Banco banco:getBancoList()){
            System.out.println("Banco: "+banco.getNome());
        }
    }

    @Override
    public String getNome() {
        return "LISTAR BANCOS";
    }
}
