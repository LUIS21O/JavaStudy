public class CriaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.titular = "Luis Otavio";
        primeiraConta.agencia = 200;
        primeiraConta.numero = 1;
        primeiraConta.saldo = 4000.00;

        System.out.println("O Valor do saldo do Cliente " +  primeiraConta.titular + " é "+ primeiraConta.saldo);

        Conta segundaConta = new Conta();

        segundaConta.titular = "Ivan";
        segundaConta.agencia = 200;
        segundaConta.numero = 2;
        segundaConta.saldo = 50.0;

        System.out.println("O valor do saldo do Cliente " + segundaConta.titular + " é "  + segundaConta.saldo);
    }
}
