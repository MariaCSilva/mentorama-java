package polimorfismo.atividadeMod8.componentes;

import polimorfismo.atividadeMod8.Banco;
import polimorfismo.atividadeMod8.Cliente;
import polimorfismo.atividadeMod8.ContaSalario;

import static polimorfismo.atividadeMod8.componentes.BancosDB.adicionaBanco;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Constantes.*;
import static polimorfismo.atividadeMod8.componentes.Layout.*;

public class NovaContaSalario implements IOpcao {
    @Override
    public String getNome() {
        return "CRIAR CONTA SALÁRIO";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,TITULO_CONTA_SALARIO);
        Entrada entrada = new Entrada();
        String banco = entrada.lerTexto(SOLICITA_BANCO);
        if(BancosDB.bancoExiste(banco)){
            int idCliente = entrada.lerInteiro(SOLICITA_ID_CLIENTE);
            Banco banco1 = BancosDB.getBanco(banco);
            if (banco1.temCliente(idCliente)){
                int numero = entrada.lerInteiro(SOLICITA_CONTA);
                int agencia = entrada.lerInteiro(SOLICITA_AGENCIA);
                double deposito = entrada.lerReal(DEPOSITO_INICIAL.concat(SOLICITA_VALOR));
                Cliente cliente = banco1.getCliente(idCliente);
                ContaSalario cs = new ContaSalario(
                        numero,
                        agencia,
                        banco1,
                        cliente,
                        deposito

                );
                banco1.addConta(cs);
                adicionaBanco(banco1);
                System.out.println(cs);
                exibeMensagemSucesso(MENSAGEM_CONTA_CRIADA);
            }else {
                exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_CIENTE_NAO_EXISTE));
            }

        }else {
            exibeMensagemErro(MENSAGEM_ERRO.concat(" ").concat(MENSAGEM_BANCO_NAO_EXISTE));
        }

    }
}
