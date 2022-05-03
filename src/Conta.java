public abstract class Conta implements IConta {

    private static final int agenciaPadrao = 1;
    private static int sequencial = 1;

    protected int agencia;
    protected int conta;
    protected double saldo =0;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        agencia = agenciaPadrao;
        conta = sequencial++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getConta() {
        return conta;
    }


    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirAtributos() {
        System.out.printf("Titular: %s", cliente.getNome());
        System.out.printf("\nAgencia: %d", agencia);
        System.out.printf("\nConta: %d", conta);
        System.out.printf("\nSaldo: %.2f", saldo);
    }
}


