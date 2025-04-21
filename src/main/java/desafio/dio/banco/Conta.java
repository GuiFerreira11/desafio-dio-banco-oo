package desafio.dio.banco;

public abstract class Conta {

  private static final int AGENCIA_PADRAO = 1;
  private static int NUMERACAO_CONTAS = 1;

  protected int agencia;
  protected int numeroConta;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numeroConta = NUMERACAO_CONTAS++;
    this.saldo = 0d;
    this.cliente = cliente;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino) {
    sacar(valor);
    contaDestino.depositar(valor);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  @Override
  public String toString() {
    return "Titular: %s\n Agencia: %d\n Conta: %d\n Saldo: %.2f\n".formatted(cliente.getNome(), agencia, numeroConta,
        saldo);
  }

}
