package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.getBancoList;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.TITULO_LISTA_BANCOS;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;


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
