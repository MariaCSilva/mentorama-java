package classesEObjetos.pacote5;

public class Variavel {
    public static void main(String[] args){
        Variavel variavel =  new Variavel();
        variavel.tipoInteiro();
        variavel.manipularDouble();
        variavel.manipularInteiro();
        variavel.converterIntLong();
        variavel.converterCastLongInt();
        variavel.converterIntDouble();
        variavel.converterCastDoubleLong();
        variavel.tipoTexto();
        variavel.manipularString();
        variavel.operadorMod();
        variavel.utilizarEnum();
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

    public void converterIntLong(){
        int valor1 = 12;
        long valorLong = valor1;
        System.out.println(valorLong);
        int valorInt = (int)valorLong;
        System.out.println(valorInt);
    }
    public void converterCastLongInt(){
        long valorLong = 12;
        System.out.println(valorLong);
        int valorInt = (int)valorLong;
        System.out.println(valorInt);
    }

    public void converterIntDouble(){
        int valorInt = 12;
        System.out.println(valorInt);
        double valorDouble = valorInt;
        System.out.println(valorDouble);
    }

    public void converterCastDoubleLong(){
        double valorDouble = 10;
        System.out.println(valorDouble);
        long valorLong = (long)valorDouble;
        System.out.println(valorLong);
    }

    public void tipoTexto(){
        char vetores[] = {'M', 'e','n'};
        String texto = String.valueOf(vetores);
        System.out.println(texto);

        long longConvertido = 12;
        String valor = String.valueOf(longConvertido);

        System.out.println(valor);
        Double valorDouble = Double.valueOf(valor);
        System.out.println(valorDouble);

    }

    public void manipularString(){
        String texto = "Mentorama - Java - Curso = Maio";
        String texto1 = "Mentorama - JAVA";
        String vazia = "";
        System.out.println(texto.charAt(1));
        System.out.println(texto.compareTo(texto1));
        System.out.println(texto.compareToIgnoreCase(texto1));
        System.out.println(texto.equals(texto1));
        System.out.println(texto.equalsIgnoreCase(texto1));
        System.out.println(texto.startsWith("Men"));
        System.out.println(texto1.endsWith("JAVA"));
        String[] textos = texto.split("-");
        for (String t : textos){
            System.out.println(t);
        }

        for (String t : textos){
            System.out.println(t.toUpperCase());
        }

        for (String t : textos){
            System.out.println(t.trim());
        }

        System.out.println(texto.isEmpty());
        System.out.println(vazia.isEmpty());

        System.out.println(texto.substring(1,4));

        System.out.println("Carro " + "Veloz");
        System.out.println("Carro ".concat("Veloz") );

    }

    public void operadorMod(){
        System.out.println(5 % 2); //5 mod 2
    }

    public void utilizarEnum(){
        System.out.println(Cores.VERMELHO.getTexto());
    }
}
