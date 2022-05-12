public class ContaPoupanca extends Conta {
    String tipoConta = "Conta Poupança";

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.tipoConta = "Conta Poupança";
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Poupanca");
        this.imprimirAtributos();
    }
}
