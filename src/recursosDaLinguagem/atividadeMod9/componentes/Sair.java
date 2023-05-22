package recursosDaLinguagem.atividadeMod9.componentes;

import static polimorfismo.atividadeMod8.componentes.ConsoleColors.BLUE;
import static polimorfismo.atividadeMod8.componentes.Layout.imprimeLinha;

public class Sair implements IOpcao {
    @Override
    public String getNome() {
        return "SAIR";
    }

    @Override
    public void acao() {
        imprimeLinha(BLUE,"Sessão finalizada");
        System.out.println("Até a próxima!!");
    }
}
