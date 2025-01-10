Sistema de Gerenciamento de Conta Bancária

🔎 Descrição

Este projeto é um sistema de gerenciamento de contas bancárias desenvolvido em Java. Ele permite realizar operações básicas como:

    ➕ Criar uma conta bancária com número, titular, saldo inicial e limite de saque.

    💳 Realizar depósitos e saques com validações de regras de negócio.

    ⚠️ Gerenciar exceções para tratar erros como tentativa de saque acima do limite ou saldo insuficiente.

⚙️ Funcionalidades

1. 📝 Cadastro de Conta

O usuário pode cadastrar uma conta informando:

    Número da conta (inteiro)

    Titular da conta (texto)

    Saldo inicial (valor decimal)

    Limite de saque (valor decimal)

2. 💰 Depósito

Permite adicionar um valor ao saldo da conta.

3. 💳 Saque

Realiza a retirada de um valor do saldo da conta, com as seguintes validações:

    O valor não pode exceder o limite de saque.

    O saldo deve ser suficiente para a operação.

4. ⚠️ Tratamento de Exceções

O sistema utiliza exceções personalizadas para tratar erros relacionados às operações:

    Saldo insuficiente: Quando o saldo da conta é menor que o valor do saque.

    Limite de saque excedido: Quando o valor do saque é maior que o limite definido para a conta.


🗂️ Estrutura do Projeto

Arquitetura de Pastas

    ├── src
    │   ├── Main.java          # Classe principal
    │   ├── Account.java       # Classe da conta bancária
    │   └── DomainAccount.java # Classe de exceção personalizada
    ├── README.md              # Documentação do projeto
    └── LICENSE                # Licença do projeto


Classes Principais

1. Account

Esta classe representa a conta bancária e contém:

    Atributos: number, holder, balance, withdrawLimit.

    Métodos:

       deposit(double amount): Adiciona um valor ao saldo.

       withdraw(double amount): Realiza um saque com validações de saldo e limite.

2. DomainAccount

Exceção personalizada para erros relacionados à conta bancária. Extende a classe RuntimeException.

3. Main

Classe principal que executa o sistema, gerencia a entrada de dados e exibe as mensagens ao usuário.
