public abstract class Conta implements IConta {
    private static final int agenciaPadrao = 1;
    private static int sequencial = 1;
    protected int agencia = 1;
    protected int conta;
    protected double saldo = 0.0D;
    private Cliente cliente;
    protected String tipoConta = "";

    public Conta(Cliente cliente) {
        this.conta = sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getConta() {
        return this.conta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributos() {
        System.out.printf("Titular: %s", this.cliente.getNome());
        System.out.printf("CPF: ", this.cliente.getCpf());
        System.out.printf("\nAgencia: %d", this.agencia);
        System.out.printf("\nConta: %d", this.conta);
        System.out.printf("\nSaldo: %.2f", this.saldo);
    }
}