package vetoresEColecoes.atividadeMod6;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static Diario diario = new Diario();
    public static void main(String[] args){
        menu();
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
        String continua = "";

        do{
            System.out.print("Informe o codigo do aluno:");
            String codigo = scanner.next();

            System.out.print("Informe o nome do aluno:");
            String nome = scanner.next();

            Aluno aluno = new Aluno(codigo,nome);
            diario.adicionarAluno(aluno);
            System.out.println("Deseja adicionar um novo aluno?  ");
            continua = continuar();
        }while (continua.toUpperCase().equals("S"));
    }

    public static void marcarPresenca(Diario diario){
        Scanner scanner = new Scanner(System.in);
        String continua = "s";
        int dia = 0;
        do{
            Date data = DataUtil.dia(dia);
            for (Aluno aluno : diario.getAlunos().values()){
                System.out.println("Informe P para Presença e F para Ausência.");
                System.out.print("Aluno(a) "+ aluno.getNome() +": ");
                String presenca = scanner.next();
                diario.adicionarPresenca(data,presenca, aluno);
            }
            System.out.println("Deseja marcar presença para uma nova data?  ");
            continua = continuar();
            if (continua.toUpperCase().equals("S")){
                dia++;
            }
        }while (continua.toUpperCase().equals("S"));
    }

    public static String continuar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite S para continuar e qualquer outra tecla para voltar ao menu principal: ");
         return scanner.next();
    }
}
