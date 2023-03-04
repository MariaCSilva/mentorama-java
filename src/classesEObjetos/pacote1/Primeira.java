package classesEObjetos.pacote1;

public class Primeira {
    private static int variavelEstatica = 1;
    private int atributoClasse = 2;

    public static final String PRETO = "preto";

    public void setCor(String cor){
        System.out.println(cor);
    }

    public static void metodoEstatico(){
        System.out.println("Sou um metodo estatico, só posso usar valores recursos estaticos e não posso ser acessado por instancias de objetos");
        System.out.println("Estou mostrando o valor de variável estática: "+ variavelEstatica);
        variavelEstatica = 3;
        System.out.println("Estou mostrando o valor de variável estática depois de alterada: "+ variavelEstatica);

    }

    public void metodo(){
        System.out.println("Sou um método que pode ser acessado através de uma instância e posso acessar atributos usar os recursos dessa classe sendo ou não estáticos.");
        System.out.println("Estou mostrando um atributo de classe: "+atributoClasse);
        atributoClasse = atributoClasse + 2;
        System.out.println("Estou mostrando um atributo de classe alterado: "+atributoClasse);

    }

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
