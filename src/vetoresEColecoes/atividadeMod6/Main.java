package vetoresEColecoes.atividadeMod6;

import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static Diario diario = new Diario();
    public static void main(String[] args){

        menu();
        fluxo(diario);
    }

    public static void menu(){
        int opcao;
        do {
            System.out.println("---------------------------------------");
            System.out.println("-------- Controle de Presença ---------");
            System.out.println("1 - Adicionar aluno ao diário");
            System.out.println("2 - Registrar presença");
            System.out.println("3 - Imprimir Diário");
            System.out.println("0 - Sair");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe a opção desejada: ");
            opcao = scanner.nextInt();
            processar(opcao);
        }while(opcao != 0);

    }

    public static void processar(int opcao){
        switch (opcao){
            case 0:{
                System.out.println("Programa Finalizado");
                break;
            }
            case 1:{
                adicionarAluno(diario);
                break;
            }
            case 2:{
                marcarPresenca(diario);
                break;
            }
            case 3:{
               diario.imprime();
                break;
            }
            default:{
                System.out.println("Escolha uma opção válida! Para finalizar Digite 0");
            }
        }

    }

    public static void adicionarAluno(Diario diario){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o codigo do aluno:");
        String codigo = scanner.next();
        System.out.println();
        System.out.print("Informe o nome do aluno:");
        String nome = scanner.next();
        Aluno aluno = new Aluno(codigo,nome);
        diario.adicionarAluno(aluno);
    }

    public static void marcarPresenca(Diario diario){
        Calendar data = Calendar.getInstance();
        data.add(Calendar.DAY_OF_MONTH, -2);
        Calendar data2 = Calendar.getInstance();
        data2.add(Calendar.DAY_OF_MONTH, -1);
        Calendar data3= Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        for (Aluno aluno : diario.getAlunos().values()){
            System.out.println("Informe P para Presença e F para do aluno "+ aluno.getNome());
            String presenca = scanner.next();
            diario.adicionarPresenca(data.getTime(),presenca, aluno);
        }

    }
    public static void fluxo(Diario diario){

        Calendar data = Calendar.getInstance();
        data.add(Calendar.DAY_OF_MONTH, -2);
        Calendar data2 = Calendar.getInstance();
        data2.add(Calendar.DAY_OF_MONTH, -1);
        Calendar data3= Calendar.getInstance();


        Aluno aluno = new Aluno("001","Joao");
        Aluno aluno2 = new Aluno("002","Pedro");
        Aluno aluno3 = new Aluno("003","Mariana Soares Dias");
        Aluno aluno4 = new Aluno("004","Joelma");



        diario.adicionarAluno(aluno);
        diario.adicionarAluno(aluno2);
        diario.adicionarAluno(aluno3);
        diario.adicionarAluno(aluno4);

        diario.adicionarPresenca(data.getTime(),"P",aluno);
        diario.adicionarPresenca(data.getTime(), "P",aluno2);
        diario.adicionarPresenca(data.getTime(), "F",aluno3);
        diario.adicionarPresenca(data.getTime(), "P",aluno4);

        diario.adicionarPresenca(data2.getTime(),"P",aluno);
        diario.adicionarPresenca(data2.getTime(), "P",aluno2);
        diario.adicionarPresenca(data2.getTime(), "P",aluno3);
        diario.adicionarPresenca(data2.getTime(), "P",aluno4);

        diario.adicionarPresenca(data3.getTime(),"F",aluno);
        diario.adicionarPresenca(data3.getTime(), "P",aluno2);
        diario.adicionarPresenca(data3.getTime(), "P",aluno3);
        diario.adicionarPresenca(data3.getTime(), "P",aluno4);
        diario.imprime();
    }

}
