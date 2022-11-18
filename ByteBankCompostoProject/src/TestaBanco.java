import javax.sound.midi.Soundbank;

public class TestaBanco {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Luis Otavio");
        cliente1.setProfissao("Analista de Sistemas");
        cliente1.setCpf("111.222.333-44");

        Conta contaLuis = new Conta();
        contaLuis.deposita(100);

        contaLuis.setTitular(cliente1);
        System.out.println(contaLuis.getTitular().getNome());
    }
}
