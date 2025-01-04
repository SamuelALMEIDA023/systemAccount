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
