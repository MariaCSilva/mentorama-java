package recursosDaLinguagem.atividadeMod9.componentes;

import recursosDaLinguagem.atividadeMod9.Banco;
import recursosDaLinguagem.atividadeMod9.Cliente;
import recursosDaLinguagem.atividadeMod9.ContaPoupanca;

import java.util.Calendar;

import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.adicionaBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.BancosDB.getBanco;
import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Constantes.*;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.*;

public class NovaContaPoupanca implements IOpcao {
    @Override
    public String getNome() {
        return "CRIAR CONTA POUPANÇA";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CONTA_POUPANCA);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        if (BancosDB.bancoExiste(banco)){
            int numero = entrada.lerInteiro(SOLICITA_CONTA);
            int idCliente = entrada.lerInteiro(SOLICITA_ID_CLIENTE);
            Banco banco1 = getBanco(banco);
            if (banco1.temCliente(idCliente)){
                int agencia = entrada.lerInteiro(SOLICITA_AGENCIA);
                double deposito = entrada.lerReal(DEPOSITO_INICIAL.concat(SOLICITA_VALOR));
                int diaAniversario = getDiaAniversario() ;
                double taxajuros = entrada.lerReal(SOLICITA_TAXA_JUROS);
                Cliente cliente = banco1.getCliente(idCliente);
                ContaPoupanca cp = new ContaPoupanca(
                        numero,
                        agencia,
                        banco1,
                        cliente,
                        deposito,
                        diaAniversario,
                        taxajuros

                );

                banco1.addConta(cp);
                adicionaBanco(banco1);
                System.out.println(cp);
                exibeMensagemSucesso(MENSAGEM_CONTA_CRIADA);
            }else {
                exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CIENTE_NAO_EXISTE));
            }

        }else {
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }
    }
    private int getDiaAniversario(){
        Calendar data = Calendar.getInstance();
        data.set(Calendar.MONTH, data.get(Calendar.MONTH) );
        int quantidadeDias = data.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dia= (int) Math.floor(Math.random() * quantidadeDias);
        if(dia < 15){
            return data.get(Calendar.DAY_OF_MONTH);
        }
        return dia;
    }


}
