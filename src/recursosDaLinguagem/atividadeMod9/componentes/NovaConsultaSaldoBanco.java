package recursosDaLinguagem.atividadeMod9.componentes;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.bancoExiste;
import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.getBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.exibeMensagemErro;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;

public class NovaConsultaSaldoBanco implements IOpcao {


    @Override
    public String getNome() {
        return "[BANCO]CONSULTA SALDO";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE, TITULO_CONSULTA_SALDO_BANCO);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        if(bancoExiste(banco)){
            System.out.println("Saldo do banco: "+getBanco(banco).getSaldoPorBanco());
        }else{
           exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }
    }
}
