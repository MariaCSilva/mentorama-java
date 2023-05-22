package recursosDaLinguagem.atividadeMod9.execucao;

import recursosDaLinguagem.atividadeMod9.componentes.*;

import static recursosDaLinguagem.atividadeMod9.componentes.ConsoleColors.BLUE;
import static recursosDaLinguagem.atividadeMod9.componentes.Layout.imprimeLinha;

public class TestaBanco {
    static Entrada entrada = new Entrada();
    static Menu menu = new Menu();
    public static void main(String[] args) {
        menu();
    }

    public static  void menu(){
        menu.adicionaOpcao(new CadastrarBanco());
        menu.adicionaOpcao(new ListarBancos());
        menu.adicionaOpcao(new CadastrarCliente());
        menu.adicionaOpcao(new ListarClientes());
        menu.adicionaOpcao(new NovaContaCorrente());
        menu.adicionaOpcao(new NovaContaPoupanca());
        menu.adicionaOpcao(new NovaContaSalario());
        menu.adicionaOpcao(new NovoDepositoConta());
        menu.adicionaOpcao(new NovoSaqueConta());
        menu.adicionaOpcao(new NovaTransferencia());
        menu.adicionaOpcao(new NovaConsultaSaldoConta());
        menu.adicionaOpcao(new NovaConsultaSaldoBanco());
        int opcao;
        do {
            imprimeLinha();
            imprimeLinha(BLUE, "menu");
            imprimeLinha();
            menu.exibeOpcoes();
            imprimeLinha();
            opcao = entrada.lerInteiro("Informe a opção desejada: ");
            imprimeLinha();
           menu.executa(opcao);
        }while (opcao != 0);
    }
}