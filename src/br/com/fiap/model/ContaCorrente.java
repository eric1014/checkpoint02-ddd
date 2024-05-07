package br.com.fiap.model;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(int numeroConta, String titular, double saldoInicial, double taxaManutencao) {
        super(numeroConta, titular, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    public void aplicarTaxaManutencao() {
        saldo -= taxaManutencao;
    }
}
