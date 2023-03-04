package classesEObjetos.pacote2;

import classesEObjetos.pacote1.Primeira;

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
