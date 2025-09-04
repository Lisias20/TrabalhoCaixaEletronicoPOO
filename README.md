# Caixa Eletrônico em Java 
 Sobre o Projeto
Este é um sistema de caixa eletrônico desenvolvido em Java como parte do nosso aprendizado em programação. O sistema simula as operações básicas de um caixa eletrônico real, permitindo depósitos, saques, consulta de saldo e visualização de extrato.

## Desenvolvedores 🧑‍💻
| Nome           |  Matrícula |
|----------------|------------|
| Cláudio Lísias | 01667062 |
| Victor Moises  | 01667062 |
| Romualdo Everton | 01793416|
| Leonardo Rodrigues | 01731489 |

# O que aprendemos com este projeto 🎯
### Desenvolvendo esse caixa eletrônico, colocamos em prática vários conceitos importantes do Java:

- Programação Orientada a Objetos: Criamos a classe `Transacao` para representar cada operação

- Estruturas de dados: Usamos `ArrayList` para armazenar o histórico de transações

- Controle de fluxo: Implementamos menus com `if-else` e loops `do-while`

- Manipulação de datas: Aprendemos a formatar datas com `SimpleDateFormat`

- Validação de entrada: Implementamos verificações para evitar valores inválidos

## Funcionalidades ️️️️️️️️⚙️
💵 Depósito: Adiciona dinheiro à conta

🏧 Saque: Retira dinheiro (com verificação de saldo)

📊 Saldo: Mostra o saldo atual

📋 Extrato: Exibe o histórico completo de transações

🚪 Sair: Encerra o programa

# Como executar 🚀
```bash
# Compilar
javac CaixaEletronico.java

# Executar
java CaixaEletronico
```

## Como usar 📋
### 1. O programa mostra um menu com 5 opções

### 2. Digite o número da operação desejada:

- `1` para depositar

- `2` para sacar

- `3` para ver saldo

- `4` para ver extrato

- `5` para sair

### 3. Siga as instruções na tela para cada operação

# Estrutura do código 🏗️


### Classe Principal `CaixaEletronico`

Controla o fluxo principal do programa e gerencia o menu.

### Classe `Transacao`
Representa cada operação bancária com:

Data e hora

Tipo (Depósito/Saque)

Valor

Métodos Principais


`depositar()`: Adiciona valor à conta

`sacar()`: Remove valor (com validações)

`consultarSaldo()`: Mostra saldo atual

`verExtrato()`: Exibe histórico de transações

## Desafios que superamos 💡
Aprender a usar `ArrayList` para armazenar objetos

Implementar validações para evitar saldo negativo

Formatar datas e valores monetários corretamente

Criar uma interface de usuário intuitiva

## Exemplo de uso 🎨
```bash
--- Caixa Eletrônico ---
1. Depositar
2. Sacar
3. Consultar Saldo
4. Ver Extrato
5. Sair

Escolha: 1
Digite o valor: R$ 100
Depósito realizado!

Escolha: 4
25/10/2023 14:30 - Depósito: R$ 100,00
Saldo: R$ 100,00
```
# Tecnologias Utilizadas 🛠️

- Java 17+ - Linguagem principal

- ArrayList - Para armazenamento de transações

- SimpleDateFormat - Formatação de datas

- Scanner - Leitura de inputs do usuário

