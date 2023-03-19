package classesEObjetos.pacote5;

public class Variavel {
    public static void main(String[] args){
        Variavel variavel =  new Variavel();
        variavel.manipularDouble();
        variavel.manipularInteiro();
    }

    public void tipoInteiro(){
        Integer valor1 = 12; //Classe wrapper (Autoboxing)
        int valor2 = valor1; //Tipo primitivo (Auto-unboxing)
        System.out.println(valor1);
        System.out.println(valor2);
        valor2 = 20;

        System.out.println(valor1);
        System.out.println(valor2);
    }

    public void gerarNullPointerException(){
        System.out.println("-------------");
        Integer valor2 = null;
        valor2.doubleValue();
    }

    public void manipularDouble(){
     Double valor1 = 12d;
     Double valor2 = 8d;
     Double resultado = valor1 / valor2;

     System.out.println(resultado);

    }

    public void manipularInteiro(){
        Integer valor1 = 12;
        Integer valor2 = 8;
        Integer resultado = valor1 / valor2;

        System.out.println(resultado);

    }
}
