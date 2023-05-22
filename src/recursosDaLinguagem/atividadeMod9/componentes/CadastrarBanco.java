package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.adicionaBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.exibeMensagemSucesso;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;


public class CadastrarBanco implements IOpcao {
    Entrada entrada = new Entrada();
    @Override
    public void acao() {
        imprimeLinha(BLUE, TITULO_CADASTRO_BANCO);
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        adicionaBanco(new Banco(banco));
        System.out.println(banco);
        exibeMensagemSucesso(MENSAGEM_SUCESSO);
    }

    @Override
    public String getNome() {
        return "CADASTRAR BANCO";
    }
}
