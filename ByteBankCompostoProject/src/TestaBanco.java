import javax.sound.midi.Soundbank;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Luis Otavio";
        cliente1.profissao = "Analista de Sistemas";
        cliente1.cpf = "111.222.333-44";

        Conta contaLuis = new Conta();
        contaLuis.deposita(100);

        contaLuis.titular = cliente1;
        System.out.println(contaLuis.titular.nome);
    }
}
