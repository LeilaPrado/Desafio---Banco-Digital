public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Leila");

        Conta conta1 = new ContaCorrente(cliente1);
        Conta conta2 = new ContaPoupanca(cliente1);

        conta1.depositar(100);
        conta1.transferir(50,conta2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }

}
