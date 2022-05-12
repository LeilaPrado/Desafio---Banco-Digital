public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.tipoConta = "Conta Corrente";
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void imprimirExtrato() {
        System.out.println("\nExtrato Conta Corrente");
        this.imprimirAtributos();
    }
}
