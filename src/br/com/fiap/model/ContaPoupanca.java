package br.com.fiap.model;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numeroConta, String titular, double saldoInicial, double taxaJuros) {
        super(numeroConta, titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void calcularJuros() {
        saldo += saldo * taxaJuros / 100;
    }
}
