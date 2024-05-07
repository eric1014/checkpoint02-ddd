package br.com.fiap.model;

public class ContaInvestimento extends ContaBancaria {
    private String perfilInvestimento;

    public ContaInvestimento(int numeroConta, String titular, double saldoInicial, String perfilInvestimento) {
        super(numeroConta, titular, saldoInicial);
        this.perfilInvestimento = perfilInvestimento;
    }
}