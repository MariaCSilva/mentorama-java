package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Conta;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.adicionaBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.getBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;

public class NovoDepositoConta implements IOpcao {
    @Override
    public String getNome() {
        return "DEPÓSITO CONTA";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE, TITULO_DEPOSITO);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
      if (BancosDB.bancoExiste(banco)){
          int numero = entrada.lerInteiro(SOLICITA_CONTA);

          Banco banco1 = getBanco(banco);
          if (banco1.temConta(numero)){
              double valor = entrada.lerInteiro(DEPOSITO.concat(SOLICITA_VALOR));
              Conta conta = banco1.getConta(numero);
              conta.depositar(valor);
              banco1.addConta(conta);
              adicionaBanco(banco1);
              exibeMensagemSucesso(MENSAGEM_SUCESSO_DEPOSITO);
          }else {
              exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CONTA_NAO_EXISTE));
          }
      }
      else {
         exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
      }
    }

}
