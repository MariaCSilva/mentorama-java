package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Cliente;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.bancoExiste;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.exibeMensagemErro;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;

public class ListarClientes implements IOpcao {

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CONSULTA_CLIENTES);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        Banco banco1 = BancosDB.getBanco(banco);
        if(bancoExiste(banco)){
            imprimeLinha(BLUE,TITULO_LISTA_CLIENTES+banco );
            for (Cliente cliente : banco1.getClienteList()){
                System.out.println("ID: "+cliente.getId());
                System.out.println("Nome: "+cliente.getNome());
                imprimeLinha();
            }
        }else {
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ".concat(MENSAGEM_BANCO_NAO_EXISTE)));
        }

    }

    @Override
    public String getNome() {
        return "LISTAR CLIENTES";
    }
}
