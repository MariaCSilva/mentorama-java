package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.ChequeEspecial;
import recursosDaLinguagem.atividadeMod9.Cliente;
import recursosDaLinguagem.atividadeMod9.ContaCorrente;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.*;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;

public class NovaContaCorrente implements IOpcao {
    private Entrada entrada = new Entrada();
    @Override
    public String getNome() {
        return "CRIAR CONTA CORRENTE";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CONTA_CORRENTE
        );
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
       if(bancoExiste(banco)){
           int idCliente = entrada.lerInteiro(SOLICITA_ID_CLIENTE);
           Banco banco1 = getBanco(banco);
           if (banco1.temCliente(idCliente)){
               int numero = entrada.lerInteiro(SOLICITA_CONTA);
               int agencia = entrada.lerInteiro(SOLICITA_AGENCIA);
               double deposito = entrada.lerReal(DEPOSITO_INICIAL.concat(SOLICITA_VALOR));
               Cliente cliente = banco1.getCliente(idCliente);
               ContaCorrente cc = new ContaCorrente(
                       numero,
                       agencia,
                       banco1,
                       cliente,
                       deposito,
                       criarChequeEspecial()
               );

               banco1.addConta(cc);
               adicionaBanco(banco1);
               System.out.println(cc);
               exibeMensagemSucesso(MENSAGEM_CONTA_CRIADA);
           }else {
               exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CIENTE_NAO_EXISTE));
           }
       }else {
           System.err.println("Informe um banco cadastrado");
       }
    }

    private ChequeEspecial criarChequeEspecial(){
        ChequeEspecial chequeEspecial = new ChequeEspecial();
        String resposta = entrada.lerTexto("A conta possui cheque especial? S/N ");
        if(resposta.equalsIgnoreCase("s")){
            chequeEspecial.setHabilitado(true);
            chequeEspecial.setLimiteChequeEspecial(entrada.lerReal("Informe o limite do cheque especial: "));
            chequeEspecial.setSaldoChequeEspecial(entrada.lerReal("Informe o saldo do cheque especial: "));
        }
        else {
            chequeEspecial .setHabilitado(false);
            chequeEspecial.setSaldoChequeEspecial(0);
        }
        return chequeEspecial;
    }

}
