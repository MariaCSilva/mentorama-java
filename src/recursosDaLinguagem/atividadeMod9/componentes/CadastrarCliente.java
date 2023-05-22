package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Cliente;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.bancoExiste;
import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.getBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;


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
            String resposta = entrada.lerTexto(SOLICITA_STATUS);
            boolean status;
            if (resposta.equalsIgnoreCase("s")){
                status = true;
            }else {
                status = false;
            }
            int compras = entrada.lerInteiro(SOLICITA_COMPRAS);

            Cliente cliente = new Cliente(nomeCliente,status,compras );
            getBanco(banco).addCliente(cliente);
            System.out.println(cliente);
           exibeMensagemSucesso(MENSAGEM_SUCESSO);
        }else{
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }

    }
}
