package Variaveis;

public class AtividadeMod5 {
    public static void main(String[] args){
        Integer num = 30;
        System.out.println(calcula(num, 2, "soma"));
        System.out.println(calcula(num, 5, "mult"));
        System.out.println(calcula(num,3 , "sub"));
        System.out.println(Float.valueOf(calcula(num, 3, "div")));
        System.out.println(calcula(num, 2,"mod"));
        System.out.println(concatena("Abacaxi", "Abacate"));

        for (String t: separa(concatena("Abacaxi", "Abacate"))){
            System.out.println(t.trim());
        }
    }

    public static Integer calcula(Integer n, Integer n2, String operacao){
        switch (operacao){
            case "soma":{
                n = n + n2;
                break;
            }
            case "sub":{
                n = n - n2;
                break;
            }
            case "mult":{
                n = n * n2;
                break;
            }
            case "div":{
                n = n / n2;
                break;
            }
            case "mod":{
                n = n % n2;
                break;
            }
            default:{
                System.out.println("Operação Inválida");
            }
        }
        return n;
    }

    public static String concatena(String texto1, String texto2){
        return texto1.concat(" - ").concat(texto2);
    }

    public static String[] separa(String texto){
        return texto.split("-");
    }
}
