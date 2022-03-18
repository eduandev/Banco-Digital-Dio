package model;

public class Main {

    public static void main(String[] args) {


        Cliente eduardo = new Cliente();

        eduardo.setNome("Eduardo");

        Conta cc = new ContaCorrente(eduardo);
        cc.sacar(300);

        Conta poupanca = new ContaPoupanca(eduardo);
        poupanca.depositar(1500);
        poupanca.transferir(500, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}