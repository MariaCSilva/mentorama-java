package heranca.atividadeMod7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestaConta {

    public static Map<String, Conta> contas = new HashMap<>();
    public static void main(String[] args) {
        principal();
    }

    public static void principal (){
       int operacao;
        do{
        System.out.println("------------------------------------------------------");
        System.out.println("------------------- MOVIMENTAÇÕES --------------------");
        System.out.println(" 1 - NOVA CONTA");
        System.out.println(" 2 - CONSULTA");
        System.out.println(" 3 - DEPÓSITO");
        System.out.println(" 4 - SAQUE");
        System.out.println(" 0 - FINALIZAR");
        System.out.println("------------------------------------------------------");
        System.out.print("Escolha a operação que deseja realizar: ");
        Scanner scanner = new Scanner(System.in);
        operacao = scanner.nextInt();
        processar(operacao);
        }while (operacao != 0);
    }

    public static void tipo (){
        System.out.println("------------------------------------------------------");
        System.out.println("------------------- TIPO CONTA -----------------------");
        System.out.println(" 1 - CONTA CORRENTE");
        System.out.println(" 2 - CONTA POUPANÇA");
        System.out.println(" 3 - CONTA SALÁRIO");
        System.out.println("------------------------------------------------------");
    }

    public static void processar (int movimentacao){
        Scanner scanner = new Scanner(System.in);
        int tipo;
      switch (movimentacao){
          case 1: {
              tipo();
              System.out.print("Escolha o tipo da conta: ");
              tipo = scanner.nextInt();
              criarConta(tipo);
              break;
          }
          case 2: {
              tipo();
              System.out.print("Escolha o tipo da conta: ");
              tipo = scanner.nextInt();
              consultarSaldo(tipo);
              break;
          }
          case 3: {
              tipo();
              System.out.print("Escolha o tipo da conta: ");
              tipo = scanner.nextInt();
              depositar(tipo);
              break;
          }

          case 4: {
              tipo();
              System.out.print("Escolha o tipo da conta: ");
              tipo = scanner.nextInt();
              sacar(tipo);
              break;
          } default:{
              System.out.println("Escolha uma opção válida! Para finalizar Digite 0");
          }

      }
    }

    public static void criarConta (int tipo){
        int numero;
        int agencia;
        String banco;
        double depositoInicial;
        Scanner scanner = new Scanner(System.in);
        switch (tipo){
            case 1: {
                if(contaExiste(tipo)){
                    System.out.println("Já existe uma conta desse tipo! Voce pode Movimentar sua conta.");
                }else {
                    double chequeEspecial;
                    double limiteChequeEpecial;
                    System.out.print("Informe o número da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Informe o Agência da conta: ");
                    agencia = scanner.nextInt();
                    System.out.print("Informe o Banco: ");
                    banco = scanner.next();
                    System.out.print("Informe o valor do depósito Inicial: ");
                    depositoInicial = scanner.nextDouble();
                    System.out.print("Informe o valor do cheque Especial: ");
                    chequeEspecial = scanner.nextDouble();
                    System.out.print("Informe o limite do cheque Especial: ");
                    limiteChequeEpecial = scanner.nextDouble();
                    ContaCorrente cc = new ContaCorrente(numero,agencia,banco,depositoInicial,chequeEspecial,limiteChequeEpecial);
                    System.out.println(cc);
                    contas.put("1",cc);
                }

                break;
            }
            case 2: {
                if(contaExiste(tipo)){
                    System.out.println("Já existe uma conta desse tipo! Movimentar sua conta");
                }else {
                    int diaAniversario;
                    double taxaJuros;
                    System.out.print("Informe o número da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Informe o Agência da conta: ");
                    agencia = scanner.nextInt();
                    System.out.print("Informe o Banco: ");
                    banco = scanner.next();
                    System.out.print("Informe o valor do depósito Inicial: ");
                    depositoInicial = scanner.nextDouble();
                    System.out.print("Informe o dia do aniversário: ");
                    diaAniversario = scanner.nextInt();
                    System.out.print("Informe a taxa de juros: ");
                    taxaJuros = scanner.nextDouble();
                    ContaPoupanca pp = new ContaPoupanca(numero,agencia,banco,depositoInicial,diaAniversario,taxaJuros);
                    System.out.println(pp);
                    contas.put("2",pp);
                }
                break;
            }
            case 3: {
                if(contaExiste(tipo)){
                    System.out.println("Já existe uma conta desse tipo! Movimentar sua conta");
                }else {
                    int limiteSaque;
                    System.out.print("Informe o número da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Informe o Agência da conta: ");
                    agencia = scanner.nextInt();
                    System.out.print("Informe o Banco: ");
                    banco = scanner.next();
                    System.out.print("Informe o valor do depósito Inicial: ");
                    depositoInicial = scanner.nextDouble();
                    System.out.print("Informe o a quantidade limite de saque : ");
                    limiteSaque = scanner.nextInt();
                    ContaSalario cs = new ContaSalario(numero,agencia,banco,depositoInicial,limiteSaque);
                    contas.put("3",cs);
                    System.out.println(cs);
                }
                break;
            } default:{
                System.out.println("Tipo de conta inválido.");
            }
        }
    }

    public static void consultarSaldo (int tipo){
        if(contaExiste(tipo)){
            Conta conta = contas.get(String.valueOf(tipo));
            System.out.println(conta);
            System.out.println(conta.getSaldo());
        }else {
            System.out.println("Não possui conta com este tipo! Para criar acesse o menu Nova conta");
        }

    }

    public static void depositar (int tipo){
        if(contaExiste(tipo)){
            double valor;
            Scanner scanner = new Scanner(System.in);
            Conta conta = contas.get(String.valueOf(tipo));
            System.out.println(conta);
            System.out.print("Informe o valor do depósito: ");
            valor = scanner.nextDouble();
            conta.depositar(valor);
            contas.put(String.valueOf(tipo), conta);
            System.out.println(valor + " foi depositado com sucesso!!");
        }else {
            System.out.println("Não possui conta com este tipo! Para criar acesse o menu Nova conta");
        }
    }
    public static void sacar (int tipo){
        if(contaExiste(tipo)){
            double valor;
            Scanner scanner = new Scanner(System.in);
            Conta conta = contas.get(String.valueOf(tipo));
            System.out.print("Informe o valor do saque: ");
            valor = scanner.nextDouble();
            conta.sacar(valor);
            contas.put(String.valueOf(tipo), conta);
        }else {
            System.out.println("Não possui conta com este tipo! Para criar acesse o menu Nova conta");
        }
    }
    public static boolean contaExiste(int tipo){
        return contas.get(String.valueOf(tipo)) != null;
    }

}
