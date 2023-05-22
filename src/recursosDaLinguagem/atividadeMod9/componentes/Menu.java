package recursosDaLinguagem.atividadeMod9.componentes;

import java.util.ArrayList;
import java.util.List;

import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.ConsoleColors.RESET;

public class Menu {
    private List<IOpcao> opcoes = new ArrayList<>();
    public void adicionaOpcao(IOpcao opcao){
        if(opcoes.size()==0){
            opcoes.add(new Sair());
        }
        opcoes.add(opcao);
    }

    public void exibeOpcoes(){
        for (IOpcao op: opcoes){
            if (opcoes.indexOf(op)> 0){
                if(opcoes.indexOf(op)< 10){
                    System.out.println(BLUE+"# "+opcoes.indexOf(op) + "  - "+op.getNome()+ RESET);
                }else {
                    System.out.println(BLUE+"# "+opcoes.indexOf(op) + " - "+op.getNome()+ RESET);
                }
            }
        }
        System.out.println(BLUE+"# "+0+ "  - "+opcoes.get(0).getNome()+ RESET);
    }
    public void executa(int op){
        IOpcao opcao = opcoes.get(op);
        opcao.acao();
    }

}
