package classesEObjetos.pacote2;

import classesEObjetos.pacote1.Primeira;

public class Quarta extends Primeira {

    public void acessaMetodoProtected(){
        System.out.println("Chamando metodo protected por herança");
        metodoProtected();
    }
}
