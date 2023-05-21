package polimorfismo.atividadeMod8.componentes;

import polimorfismo.atividadeMod8.Banco;

import static polimorfismo.atividadeMod8.componentes.BancosDB.*;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Constantes.*;
import static polimorfismo.atividadeMod8.componentes.Layout.*;

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
