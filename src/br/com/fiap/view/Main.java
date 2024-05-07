package br.com.fiap.view;

import br.com.fiap.model.ContaCorrente;
import br.com.fiap.model.ContaPoupanca;
import br.com.fiap.model.ContaInvestimento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente(123, "Ana", 1000, 20);
        ContaPoupanca cp = new ContaPoupanca(456, "Bob", 2000, 5);
        ContaInvestimento ci = new ContaInvestimento(789, "Carlos", 3000, "Moderado");

        System.out.println("Depósito em Conta Corrente: ");
        cc.depositar(scanner.nextDouble());
        cc.aplicarTaxaManutencao();
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());

        System.out.println("Depósito em Conta Poupança: ");
        cp.depositar(scanner.nextDouble());
        cp.calcularJuros();
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());

        System.out.println("Depósito em Conta Investimento: ");
        ci.depositar(scanner.nextDouble());
        System.out.println("Saldo Conta Investimento: " + ci.getSaldo());

        scanner.close();
    }
}
