package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Conta;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.*;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;

public class NovaTransferencia implements IOpcao {
    private Entrada entrada = new Entrada();
    @Override
    public String getNome() {
        return "TRANSFERÊNCIA ENTRE CONTAS";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_TRANSFERENCIA);
        Entrada entrada = new Entrada();
        double valor = entrada.lerInteiro(TRANSFERENCIA.concat(SOLICITA_VALOR));
        String resposta = entrada.lerTexto(SOLICITA_TIPO_TRANSFERENCIA);
        if(resposta.equalsIgnoreCase("n")){
            tranferenciaOutroBanco(valor);
        }else{
            tranferenciaMesmoBanco(valor);
        }
    }

    private void tranferenciaMesmoBanco(double valor){
        imprimeLinha(BLUE,TITULO_TRANSFERENCIA.concat(" ").concat(TRANSFERENCIA_MESMO_BANCO));
        String b = entrada.lerTexto(SOLICITA_BANCO);
        if(bancoExiste(b)){
            int numero = entrada.lerInteiro(ORIGEM.concat(SOLICITA_CONTA));
            int numero2 = entrada.lerInteiro(DESTINO.concat(SOLICITA_CONTA));
            Banco banco1 = getBanco(b);
            if (banco1.temConta(numero) && banco1.temConta(numero2)){
                Conta conta1 = banco1.getConta(numero);
                Conta conta2 = banco1.getConta(numero2);
                boolean transferiu = banco1.transferir(conta1,conta2,valor);
                if(transferiu){
                    banco1.addConta(conta1);
                    banco1.addConta(conta2);
                    adicionaBanco(banco1);
                    exibeMensagemSucesso(MENSAGEM_TRANSFERENCIA_REALIZADA);
                }else {
                    exibeMensagemErro(MENSAGEM_ERRO);
                }

            }else {
                exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CONTA_NAO_EXISTE));
            }
        }else {
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }
    }
    private void tranferenciaOutroBanco(double valor){
        imprimeLinha(BLUE,TITULO_TRANSFERENCIA.concat(TRANSFERENCIA_ENTRE_BANCOS));
        String b = entrada.lerTexto(ORIGEM.concat(SOLICITA_BANCO));
        int numero = entrada.lerInteiro(ORIGEM.concat(SOLICITA_CONTA));
        String b2 = entrada.lerTexto(DESTINO.concat(SOLICITA_BANCO));
        int numero2 = entrada.lerInteiro(DESTINO.concat(SOLICITA_CONTA));
       if (bancoExiste(b) && bancoExiste(b2)){
           Banco banco1 = getBanco(b);
           Banco banco2 = getBanco(b2);
            if(banco1.temConta(numero) && banco2.temConta(numero2)){
                Conta conta1 = banco1.getConta(numero);
                Conta conta2 = banco2.getConta(numero2);
               boolean transferiu = banco1.transferir(conta1,conta2,valor);
               if (transferiu){
                   banco1.addConta(conta1);
                   banco2.addConta(conta2);
                   adicionaBanco(banco1);
                   adicionaBanco(banco2);
                   exibeMensagemSucesso(MENSAGEM_TRANSFERENCIA_REALIZADA);
               }else {
                   exibeMensagemErro(MENSAGEM_ERRO);
               }
            }else {
             exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CONTA_NAO_EXISTE));
            }
       }else {
           exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
       }
    }
}
