package classesEObjetos.modificadoresDeAcesso2;

import classesEObjetos.modificadoresDeAcesso.Primeira;
import classesEObjetos.modificadoresDeAcesso.Segunda;

public class Terceira {
    private void acessaMetodo(){
        Primeira primeiro = new Primeira();
        primeiro.metodoPublico();
        primeiro.metodoParaExibirMetodoPrivado();

        Quarta quarta = new Quarta();
        quarta.acessaMetodoProtected();
    }

    public static void main(String[] args){
        Terceira terceira = new Terceira();
        terceira.acessaMetodo();
    }
}
