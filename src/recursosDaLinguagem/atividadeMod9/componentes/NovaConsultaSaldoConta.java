package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Conta;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.*;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.exibeMensagemErro;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;

public class NovaConsultaSaldoConta implements IOpcao {
    @Override
    public String getNome() {
        return "[CONTA]CONSULTA SALDO";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CONSULTA_SALDO_CONTA);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
      if(bancoExiste(banco)){
          int numero;
          Banco banco1 = getBanco(banco);
          do {
              numero = entrada.lerInteiro(SOLICITA_CONTA);
              if(banco1.temConta(numero)){
                  Conta conta = banco1.getConta(numero);
                  System.out.println("Cliente: " + conta.getCliente().getNome());
                  System.out.println("Conta: " + conta.getNumero());
                  System.out.println("Saldo: " + conta.getSaldo());

                  banco1.addConta(conta);
                  adicionaBanco(banco1);
              }else {
                  exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CONTA_NAO_EXISTE));
              }
          }while (!banco1.temConta(numero));

      }else {
          exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
      }
    }

}
