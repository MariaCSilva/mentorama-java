package recursosDaLinguagem;

import java.util.function.Consumer;

import static polimorfismo.atividadeMod8.componentes.ConsoleColors.*;

public class MostraCliente implements Consumer {
    private String texto;
    private String corTexto;
    public MostraCliente(String texto, String corTexto) {
        this.texto = texto;
        this.corTexto = corTexto;
    }

    @Override
    public void accept(Object o) {
        System.out.print(corTexto + texto +RESET);
        System.out.println(corTexto + o + RESET);
    }
}
