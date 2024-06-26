# Sistema Bancário em Java

Este projeto implementa um sistema bancário simples em Java, utilizando conceitos de herança, encapsulamento e polimorfismo. O sistema permite a criação de diferentes tipos de contas bancárias, como conta corrente, conta poupança e conta investimento, e realiza operações básicas como depósito e saque.

## Estrutura do Projeto

O projeto está organizado em dois pacotes principais:

- `br.com.fiap.model`: Contém as classes que representam os modelos de contas bancárias.
    - `ContaBancaria` (classe abstrata base)
    - `ContaCorrente`
    - `ContaPoupanca`
    - `ContaInvestimento`
- `br.com.fiap.view`: Contém a classe `Main`, que serve como ponto de entrada para as interações com o usuário.

## Como Configurar

Assegure-se de que o JDK está instalado em seu sistema para compilar e executar este projeto. Este projeto foi desenvolvido usando o JDK 11, mas deve ser compatível com versões mais recentes.

### Passos para Compilar

1. Clone o repositório para sua máquina local usando: git clone https://github.com/eric1014/checkpoint02-ddd.git
2. Navegue até o diretório do projeto.
3. Compile o código usando: javac -d . src/br/com/fiap/view/Main.java


### Executar o Projeto

Após compilar, você pode executar o projeto a partir do diretório raiz do projeto com:


## Funcionalidades

- **Criar Contas**: O sistema permite a criação de diferentes tipos de contas bancárias:
    - Conta Corrente: com taxa de manutenção.
    - Conta Poupança: com cálculo de juros.
    - Conta Investimento: com perfil de investimento.
- **Operações Bancárias**: Cada conta permite realizar depósitos e saques. A Conta Corrente permite a aplicação de uma taxa de manutenção, e a Conta Poupança calcula juros sobre o saldo.

## Exemplo de Uso

O sistema solicitará que você escolha uma operação (depósito, saque) e especifique o valor para essa operação. Aqui está um exemplo de como o sistema funciona:

Digite o valor para depósito na conta corrente:
1000
Saldo da conta corrente: 980.0
Digite o valor para depósito na conta poupança:
500
Saldo da conta poupança: 510.0