package desafio.dio.banco;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    cliente1.setNome("Fulano");

    Cliente cliente2 = new Cliente();
    cliente2.setNome("Beltrano");

    ContaCorrente cc1 = new ContaCorrente(cliente1);
    ContaCorrente cc2 = new ContaCorrente(cliente2);

    ContaPoupanca cp1 = new ContaPoupanca(cliente1);
    ContaPoupanca cp2 = new ContaPoupanca(cliente2);

    cc1.depositar(1000);
    cc1.transferir(200, cp2);

    cp1.depositar(200);
    cp1.sacar(20);
    cp1.transferir(100, cc2);

    cc1.imprimirExtrato();
    cc2.imprimirExtrato();
    cp1.imprimirExtrato();
    cp2.imprimirExtrato();

    Banco bb = new Banco();

    bb.setNome("Banco do Brasil");
    bb.setContas(new ArrayList<Conta>(Arrays.asList(cc1, cc2, cp1, cp2)));

    System.out.println("==== Imprimindo Infos do Banco ====");
    System.out.println(bb.getNome());
    System.out.println(bb.getContas());
  }
}
