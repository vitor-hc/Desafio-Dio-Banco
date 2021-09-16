package desafio.dio.banco;

public class Main {

    public static void main(String[] args) {
        Cliente Vitor = new Cliente();
        Vitor.setNome("Vitor");

        Conta cc = new ContaPoupanca(Vitor);
         cc.depositar(200);

        Conta cp = new ContaPoupanca(Vitor);
        cp.depositar(200);
        cc.trasferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
