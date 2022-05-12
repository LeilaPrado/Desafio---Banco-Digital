public interface IConta {
    void sacar(double var1);

    void depositar(double var1);

    void transferir(double var1, Conta var3);

    void imprimirExtrato();
}
