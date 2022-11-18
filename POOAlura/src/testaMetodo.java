public class testaMetodo {

    public static void main(String[] args) {

        Conta contaLuis = new Conta();

        System.out.println(contaLuis.saldo);
        contaLuis.deposita(200);
        System.out.println(contaLuis.saldo);
        contaLuis.deposita(150);
        System.out.println(contaLuis.saldo);
        contaLuis.saca(200);
        System.out.println(contaLuis.saldo);

        Conta contaMarcela = new Conta();
        contaMarcela.deposita(1000);

        contaMarcela.transfere(500, contaLuis);
        System.out.println(contaMarcela.saldo);
        System.out.println(contaLuis.saldo);



    }
}
