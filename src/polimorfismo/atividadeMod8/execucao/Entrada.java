package polimorfismo.atividadeMod8.execucao;

import polimorfismo.atividadeMod8.Banco;
import polimorfismo.atividadeMod8.ChequeEspecial;
import polimorfismo.atividadeMod8.Cliente;
import polimorfismo.atividadeMod8.ContaCorrente;

import java.util.Map;
import java.util.Scanner;

public class Entrada {
   private Scanner scanner = new Scanner(System.in);

    public void criarBanco(Map<String, Banco> bancos){
        Banco banco = new Banco(lerTexto("Informe o nome do banco: "));
        bancos.put(banco.getNome(), banco);
    }
    private ChequeEspecial criarChequeEspecial(){
        ChequeEspecial chequeEspecial = new ChequeEspecial();
        String resposta = lerTexto("A conta possui cheque especial? S/N");
        if(resposta.equalsIgnoreCase("s")){
           chequeEspecial.setHabilitado(true);
           chequeEspecial.setLimiteChequeEspecial(lerReal("Informe o limite do cheque especial: "));
           chequeEspecial.setSaldoChequeEspecial(lerReal("Informe o saldo do cheque especial: "));
        }
        else {
            chequeEspecial .setHabilitado(false);
            chequeEspecial.setSaldoChequeEspecial(0);
        }
        return chequeEspecial;
    }

    public void criarContaCorrente (Map<String, Banco> bancos){
        String bancoNome = lerTexto("Informe o nome do banco: ");
        Banco banco = bancos.get(bancoNome);
        int numero = lerInteiro("Informe o número da conta: ");
        int agencia = lerInteiro("Informe o Agência da conta: ");
        double deposito = lerReal("Informe o valor do depósito Inicial: ");

//        Cliente cliente = banco.getCliente(lerInteiro("Informe o id do cliente: "));
        Cliente cliente = new Cliente();
        cliente.setNome("Teste");


        ContaCorrente cc = new ContaCorrente(
               numero,
                agencia,
                banco,
                cliente,
                deposito,
                criarChequeEspecial()
        );
        System.out.println(cc);
        banco.addConta(cc);
        bancos.put(banco.getNome(), banco);

    }

    private String lerTexto(String texto){
        System.out.print(texto);
       return scanner.next();

    }
    private int lerInteiro(String texto){
        System.out.print(texto);
        return scanner.nextInt();

    }
    private double lerReal(String texto){
        System.out.print(texto);
        return scanner.nextDouble();
    }
//    public static void criarConta (Map<String, Banco> bancos){
//        int numero;
//        int agencia;
//        String banco;
//        double depositoInicial;
//        Scanner scanner = new Scanner(System.in);
//        switch (tipo){
//            case 1: {
//                if(contaExiste(tipo)){
//                    System.out.println("Já existe uma conta desse tipo! Voce pode Movimentar sua conta.");
//                }else {
//                    double chequeEspecial;
//                    double limiteChequeEpecial;
//                    System.out.print("Informe o número da conta: ");
//                    numero = scanner.nextInt();
//                    System.out.print("Informe o Agência da conta: ");
//                    agencia = scanner.nextInt();
//                    System.out.print("Informe o Banco: ");
//                    banco = scanner.next();
//                    System.out.print("Informe o valor do depósito Inicial: ");
//                    depositoInicial = scanner.nextDouble();
//                    System.out.print("Informe o valor do cheque Especial: ");
//                    chequeEspecial = scanner.nextDouble();
//                    System.out.print("Informe o limite do cheque Especial: ");
//                    limiteChequeEpecial = scanner.nextDouble();
//                    ContaCorrente cc = new ContaCorrente(numero,agencia,banco,depositoInicial,chequeEspecial,limiteChequeEpecial);
//                    System.out.println(cc);
//                    contas.put("1",cc);
//                }
//
//                break;
//            }
//            case 2: {
//                if(contaExiste(tipo)){
//                    System.out.println("Já existe uma conta desse tipo! Movimentar sua conta");
//                }else {
//                    int diaAniversario;
//                    double taxaJuros;
//                    System.out.print("Informe o número da conta: ");
//                    numero = scanner.nextInt();
//                    System.out.print("Informe o Agência da conta: ");
//                    agencia = scanner.nextInt();
//                    System.out.print("Informe o Banco: ");
//                    banco = scanner.next();
//                    System.out.print("Informe o valor do depósito Inicial: ");
//                    depositoInicial = scanner.nextDouble();
//                    System.out.print("Informe o dia do aniversário: ");
//                    diaAniversario = scanner.nextInt();
//                    System.out.print("Informe a taxa de juros: ");
//                    taxaJuros = scanner.nextDouble();
//                    ContaPoupanca pp = new ContaPoupanca(numero,agencia,banco,depositoInicial,diaAniversario,taxaJuros);
//                    System.out.println(pp);
//                    contas.put("2",pp);
//                }
//                break;
//            }
//            case 3: {
//                if(contaExiste(tipo)){
//                    System.out.println("Já existe uma conta desse tipo! Movimentar sua conta");
//                }else {
//                    int limiteSaque;
//                    System.out.print("Informe o número da conta: ");
//                    numero = scanner.nextInt();
//                    System.out.print("Informe o Agência da conta: ");
//                    agencia = scanner.nextInt();
//                    System.out.print("Informe o Banco: ");
//                    banco = scanner.next();
//                    System.out.print("Informe o valor do depósito Inicial: ");
//                    depositoInicial = scanner.nextDouble();
//                    System.out.print("Informe o a quantidade limite de saque : ");
//                    limiteSaque = scanner.nextInt();
//                    ContaSalario cs = new ContaSalario(numero,agencia,banco,depositoInicial,limiteSaque);
//                    contas.put("3",cs);
//                    System.out.println(cs);
//                }
//                break;
//            } default:{
//                System.out.println("Tipo de conta inválido.");
//            }
//        }
//    }
}
