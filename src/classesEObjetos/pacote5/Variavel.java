package classesEObjetos.pacote5;

public class Variavel {
    public static void main(String[] args){
        Integer valor1 = 12; //Classe wrapper (Autoboxing)
        int valor2 = valor1; //Tipo primitivo (Auto-unboxing)
        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;

        System.out.println(valor1);
        System.out.println(valor2);
    }
}
