package polimorfismo.atividadeMod8.componentes;

import polimorfismo.atividadeMod8.Banco;
import polimorfismo.atividadeMod8.Cliente;

import static polimorfismo.atividadeMod8.componentes.BancosDB.bancoExiste;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Constantes.*;
import static polimorfismo.atividadeMod8.componentes.Layout.*;

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
