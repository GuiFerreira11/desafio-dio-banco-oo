package desafio.dio.banco;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança ===");
    System.out.println(super.toString());
  }

}
