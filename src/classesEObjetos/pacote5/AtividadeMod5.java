package classesEObjetos.pacote5;

public class AtividadeMod5 {
    public static void main(String[] args){
        Integer num = 30;
        System.out.println(calcula(num, "soma"));

    }

    public static Integer calcula(Integer n, String operacao){
        switch (operacao){
            case "soma":{
                n = n + 5;
                break;
            }
            case "sub":{
                n = n - 5;
                break;
            }
            case "mult":{
                n = n * 5;
                break;
            }
            case "div":{
                n = n / 5;
                break;
            }
            case "mod":{
                n = n % 5;
                break;
            }
            default:{
                System.out.println("Operação Inválida");
            }

        }
        return n;
    }
}
