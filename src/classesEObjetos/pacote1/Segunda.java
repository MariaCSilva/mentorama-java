package classesEObjetos.pacote1;

public class Segunda {

    private void acessaMetodo(){
        Primeira primeiro = new Primeira();
        primeiro.metodoPublico();
        primeiro.metodoParaExibirMetodoPrivado();
        primeiro.metodoProtected();
        primeiro.metodoDefault();
        primeiro.metodo();
        primeiro.setCor(Primeira.PRETO);

    }

    public static void main(String[] args){
        Segunda segunda = new Segunda();
        segunda.acessaMetodo();
        Primeira.metodoEstatico();
    }
}
