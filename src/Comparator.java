import java.util.Map;

public class Comparator implements java.util.Comparator<Map.Entry<Conta, Cliente>> {
    public Comparator() {
    }

    public int compare(Map.Entry<Conta, Cliente> entrada1, Map.Entry<Conta, Cliente> entrada2) {
        int nome = entrada1.getValue().getNome().compareTo(entrada2.getValue().getNome());
        if (nome != 0) {
            return nome;
        } else {
            int cpf = entrada1.getValue().getCpf().compareTo(entrada2.getValue().getCpf());
            if (nome != 0) {
                return cpf;
            } else {
                int agencia = Integer.compare(entrada1.getKey().getAgencia(), entrada2.getKey().getAgencia());
                if (nome != 0) {
                    return agencia;
                } else {
                    int conta = Integer.compare(entrada1.getKey().getConta(), entrada2.getKey().getConta());
                    if (nome != 0) {
                        return conta;
                    } else {
                        int tipoConta = entrada1.getKey().getTipoConta().compareTo(entrada2.getKey().getTipoConta());
                        return nome != 0 ? tipoConta : 0;
                    }
                }
            }
        }
    }
}

