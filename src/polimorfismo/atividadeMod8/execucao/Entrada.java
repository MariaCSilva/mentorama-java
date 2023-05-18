package polimorfismo.atividadeMod8.execucao;


import polimorfismo.atividadeMod8.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        String resposta = lerTexto("A conta possui cheque especial? S/N ");
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
    public void criarCliente(Map<String, Banco> bancos, String nomeBanco){
        if(bancoExiste(bancos, nomeBanco)){
            String nomeCliente = lerTexto("Informe o nome do cliente: ");
            Cliente cliente = new Cliente(nomeCliente);
            bancos.get(nomeBanco).addCliente(cliente);
        }else{
            System.out.println("Crie o banco "+nomeBanco+" para poder incluir clientes!");
        }
    }

    public void criarContaCorrente (Map<String, Banco> bancos, String nomeBanco){
        Banco banco = bancos.get(nomeBanco);
        int numero = lerInteiro("Informe o número da conta: ");
        int agencia = lerInteiro("Informe o número da Agência: ");
        double deposito = lerReal("Informe o valor do depósito Inicial: ");
        int idCliente = lerInteiro("Informe o id do cliente: ");

        Cliente cliente = banco.getCliente(idCliente);
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

    public void criarContaSalario (Map<String, Banco> bancos, String nomeBanco){
        Banco banco = bancos.get(nomeBanco);
        int numero = lerInteiro("Informe o número da conta: ");
        int agencia = lerInteiro("Informe o Agência da conta: ");
        double deposito = lerReal("Informe o valor do depósito Inicial: ");
        int idCliente = lerInteiro("Informe o id do cliente: ");

        Cliente cliente = banco.getCliente(idCliente);
        ContaSalario cs = new ContaSalario(
                numero,
                agencia,
                banco,
                cliente,
                deposito

        );
        System.out.println(cs);
        banco.addConta(cs);
        bancos.put(banco.getNome(), banco);
    }
    public void criarContaPoupanca (Map<String, Banco> bancos, String nomeBanco){
        Banco banco = bancos.get(nomeBanco);
        int numero = lerInteiro("Informe o número da conta: ");
        int agencia = lerInteiro("Informe o Agência da conta: ");
        double deposito = lerReal("Informe o valor do depósito Inicial: ");
        int diaAniversario = getDiaAniversario() ;
        double taxajuros = lerReal("Informe a taxa de juros: ");
        int idCliente = lerInteiro("Informe o id do cliente: ");
        Cliente cliente = banco.getCliente(idCliente);
        ContaPoupanca cp = new ContaPoupanca(
                numero,
                agencia,
                banco,
                cliente,
                deposito,
                diaAniversario,
                taxajuros

        );
        System.out.println(cp);
        banco.addConta(cp);
        bancos.put(banco.getNome(), banco);

    }

    public String lerTexto(String texto){
        System.out.print(texto);
       return scanner.next();

    }
    public int lerInteiro(String texto){
        System.out.print(texto);
        return scanner.nextInt();

    }
    public double lerReal(String texto){
        System.out.print(texto);
        return scanner.nextDouble();
    }

    public int getDiaAniversario(){
        Calendar data = Calendar.getInstance();
        data.set(Calendar.MONTH, data.get(Calendar.MONTH) );
        int quantidadeDias = data.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dia= (int) Math.floor(Math.random() * quantidadeDias);
        if(dia < 15){
            return data.get(Calendar.DAY_OF_MONTH);
        }
        return dia;
    }

    public static boolean bancoExiste(Map<String, Banco> bancos, String nome){
        return bancos.get(nome) != null;
    }

}
