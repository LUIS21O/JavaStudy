public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita (double valor) {

        this.saldo = this.saldo + valor;

    }


    // boolean para definir se vai poder sacar ou se não vai

    public boolean saca (double valor) {

        if (this.saldo >= valor){

            this.saldo -= valor;
            return true;

        }

        else {

            return false;
        }

    }

    public boolean transfere (double valor, Conta destino){

            if (this.saldo >= valor) {

                this.saldo -= valor;
                destino.deposita(valor);
                return true;
            }
            else {

                return false;
            }

    }
}