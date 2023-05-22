package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Conta;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.*;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;

public class NovoSaqueConta implements IOpcao {
    @Override
    public String getNome() {
        return "SAQUE CONTA";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_SAQUE);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
      if (bancoExiste(banco)){
          int numero = entrada.lerInteiro(SOLICITA_CONTA);
          Banco banco1 = getBanco(banco);
          if (banco1.temConta(numero)){
              double valor = entrada.lerInteiro(SAQUE.concat(SOLICITA_VALOR));
              Conta conta = banco1.getConta(numero);
              boolean sacou = conta.sacar(valor);
              if (sacou){
                  banco1.addConta(conta);
                  adicionaBanco(banco1);
                  exibeMensagemSucesso(MENSAGEM_SUCESSO_SAQUE);
              }else {
                  exibeMensagemErro(SAQUE.concat(MENSAGEM_ERRO));
              }
          }else {
              exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CONTA_NAO_EXISTE));
          }
      }
      else {
          exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
      }
    }

}
