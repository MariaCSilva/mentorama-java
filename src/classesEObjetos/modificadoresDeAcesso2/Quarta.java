package classesEObjetos.modificadoresDeAcesso2;

import classesEObjetos.modificadoresDeAcesso.Primeira;

public class Quarta extends Primeira {

    public void acessaMetodoProtected(){
        System.out.println("Chamando metodo protected por herança");
        metodoProtected();
    }
}
