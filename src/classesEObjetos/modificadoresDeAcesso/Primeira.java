package classesEObjetos.modificadoresDeAcesso;

public class Primeira {
    public void metodoPublico(){
        System.out.println("Método público: Acesso no projeto");
    }

    private String metodoPrivado(){
        return "Metodo Privado: Acesso só pela própria classe";
    }

    protected void metodoProtected(){
        System.out.println("Metodo Protected: Acesso dentro do mesmo pacote ou por herança");
    }

    void metodoDefault(){
        System.out.println("Metodo Default: Acesso dentro do mesmo pacote");
    }

    public void metodoParaExibirMetodoPrivado(){
        System.out.println("Chamando método privado: "+metodoPrivado());
    }
}
