package polimorfismo.atividadeMod8.componentes;

import polimorfismo.atividadeMod8.Cliente;

import static polimorfismo.atividadeMod8.componentes.BancosDB.*;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Constantes.*;
import static polimorfismo.atividadeMod8.componentes.Layout.*;

public class CadastrarCliente implements IOpcao {


    @Override
    public String getNome() {
        return "CADASTRAR CLIENTE";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CADASTRO_CLIENTE);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        if(bancoExiste( banco)){
            String nomeCliente = entrada.lerTexto(SOLICITA_NOME_CLIENTE);
            Cliente cliente = new Cliente(nomeCliente);
            getBanco(banco).addCliente(cliente);
            System.out.println(cliente);
           exibeMensagemSucesso(MENSAGEM_SUCESSO);
        }else{
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }

    }
}
