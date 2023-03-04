package classesEObjetos.modificadoresDeAcesso;

public class Segunda {

    private void acessaMetodo(){
        Primeira primeiro = new Primeira();
        primeiro.metodoPublico();
        primeiro.metodoParaExibirMetodoPrivado();
        primeiro.metodoProtected();
        primeiro.metodoDefault();

    }

    public static void main(String[] args){
        Segunda segunda = new Segunda();
        segunda.acessaMetodo();
    }
}
