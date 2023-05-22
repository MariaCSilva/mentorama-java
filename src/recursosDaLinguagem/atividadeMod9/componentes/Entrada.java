package recursosDaLinguagem.atividadeMod9.componentes;


import java.util.Scanner;

public class Entrada {
    public String lerTexto(String texto){
        Scanner scanner = new Scanner(System.in);
        System.out.print(texto);
        return scanner.nextLine();

    }
    public int lerInteiro(String texto){
        Scanner scanner = new Scanner(System.in);
        String regex = "[0-9]+";
        String entrada;
        do {
            System.out.print(texto);
            entrada = scanner.next();
        }while((!entrada.matches(regex)));
        return Integer.parseInt(entrada);

    }
    public double lerReal(String texto){
        Scanner scanner = new Scanner(System.in);
        System.out.print(texto);
        return scanner.nextDouble();
    }

}
