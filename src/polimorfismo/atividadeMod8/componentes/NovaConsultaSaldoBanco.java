package polimorfismo.atividadeMod8.componentes;

import static polimorfismo.atividadeMod8.componentes.BancosDB.*;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.*;
import static polimorfismo.atividadeMod8.componentes.Constantes.*;
import static polimorfismo.atividadeMod8.componentes.Layout.exibeMensagemErro;
import static polimorfismo.atividadeMod8.componentes.Layout.imprimeLinha;

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
