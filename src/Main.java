import java.io.PrintStream;
import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //Criação de clientes
        Cliente cliente1 = new Cliente("Leila","12345678901");
        Cliente cliente2 = new Cliente("Mario","99988877701");
        Cliente cliente3 = new Cliente("Joana","55522233300");

        Map<String, String> listaClientes = new LinkedHashMap<>(){{
            put(cliente1.getNome(),cliente1.getCpf());
            put(cliente2.getNome(),cliente2.getCpf());
            put(cliente3.getNome(),cliente3.getCpf());
        }};

        //Criação das Contas
        Conta conta1 = new ContaPoupanca(cliente1);
        Conta conta2 = new ContaCorrente(cliente1);
        Conta conta3 = new ContaCorrente(cliente2);
        Conta conta4 = new ContaPoupanca(cliente3);

        Map<Conta, Cliente> listaContas = new LinkedHashMap<>(){{
            put(conta1, cliente1);
            put(conta2, cliente1);
            put(conta3, cliente2);
            put(conta4, cliente3);

        }};

        //Consolidado Cliente para cada conta
        Set<Map.Entry<Conta, Cliente>> entries = listaContas.entrySet();

        System.out.println("Lista de clientes: ");
        for (Map.Entry<Conta, Cliente> entry : entries){
            System.out.println("Nome: "+entry.getValue().getNome()
                    + " - CPF: "+entry.getValue().getCpf()
                    +" - Agência: " +entry.getKey().getAgencia()
                    +" - Conta: " +entry.getKey().getConta()
                    +" - Conta: " +entry.getKey().getTipoConta()
                    +" - Saldo: " +entry.getKey().getSaldo());
        }

        //Operações dentro das contas
        conta1.depositar(5000);
        conta2.depositar(5000);
        conta3.depositar(5000);
        conta4.depositar(5000);

        conta1.sacar(500);
        conta2.sacar(1000);
        conta3.transferir(639.23,conta4);


        //Consolidado após operador
        System.out.println("\nLista de clientes: ");
        for (Map.Entry<Conta, Cliente> entry : entries){
            System.out.println("Nome: "+entry.getValue().getNome()
                    + " - CPF: "+entry.getValue().getCpf()
                    +" - Agência: " +entry.getKey().getAgencia()
                    +" - Conta: " +entry.getKey().getConta()
                    +" - Conta: " +entry.getKey().getTipoConta()
                    +" - Saldo: " +entry.getKey().getSaldo());
        }
    }

}
