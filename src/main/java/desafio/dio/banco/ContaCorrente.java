package desafio.dio.banco;

public class ContaCorrente extends Conta {

  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    System.out.println(super.toString());
  }

}
