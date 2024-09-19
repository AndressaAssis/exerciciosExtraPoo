# 🌟 Projeto: Cálculo de Salário com Descontos (AULA 6) 🌟

## Introdução
Este projeto em **Java** foi desenvolvido durante a aula 6 de **Programação Orientada a Objetos (POO)**. Ele simula o cálculo de salário líquido de um funcionário, aplicando descontos referentes ao **INSS** e ao **Vale Transporte**. O projeto usa conceitos de POO, como **encapsulamento**, **construtores**, e **métodos** para manipular os dados de um funcionário.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:
- **Funcionario**: Classe que representa um funcionário com atributos como nome, salário, INSS e Vale Transporte. Contém métodos para calcular o salário líquido com base nos descontos.
- **TestaFuncionario**: Classe principal que cria um objeto da classe `Funcionario` e exibe as informações como nome, salário bruto, INSS, Vale Transporte, e o salário líquido após o cálculo dos descontos.

## Funcionalidades
- **Cálculo de Desconto**: O método `calcularDesconto` realiza o cálculo do salário líquido, aplicando um desconto com base no valor do INSS e do Vale Transporte.
- **Encapsulamento**: A classe `Funcionario` utiliza getters e setters para manipular os dados dos atributos de forma segura.
- **Construtor**: A classe `Funcionario` possui um construtor para inicializar os valores dos atributos `nome`, `salario`, `INSS`, e `valeTransporte`.

# 🌟 Projeto: Sistema de Gestão de Veículos (AULA 6) 🌟

## Introdução
Este projeto desenvolvido em **Java** simula um sistema de gerenciamento de veículos. Ele permite criar objetos da classe `Veiculo`, atribuir atributos como **placa**, **tipo de combustível**, **valor do veículo**, e calcular o **IPVA**. O projeto demonstra o uso de **encapsulamento**, **métodos getters e setters** e a criação de múltiplos objetos de uma mesma classe.

## Estrutura do Projeto

O projeto é composto por duas classes principais:
- **Veiculo**: Representa um veículo, contendo informações como placa, tipo de combustível, valor e o valor do IPVA.
- **MainVeiculo**: Classe que realiza a execução do sistema, criando dois objetos `Veiculo` e exibindo suas informações no console.

### Atributos Principais da Classe `Veiculo`
- `placa`: Representa a placa do veículo.
- `tipo`: Representa o tipo de combustível utilizado pelo veículo (por exemplo, Gás ou Flex).
- `valor`: Representa o valor do veículo.
- `IPVA`: Representa o valor do Imposto sobre a Propriedade de Veículos Automotores (IPVA), que é calculado com base em uma taxa aplicada ao valor do veículo.

### Funcionalidades
1. **Criação de veículos**: O projeto permite criar objetos da classe `Veiculo` e definir atributos como placa, tipo de combustível e valor do veículo.
2. **Cálculo de IPVA**: É possível ajustar o valor do IPVA aplicando uma taxa baseada no tipo de veículo.
3. **Exibição de informações**: O sistema exibe informações detalhadas de cada veículo criado, como placa, tipo de combustível, valor e IPVA.

# 🌟 Projeto: Sistema de Cadastro de Produtos (AULA 7) 🌟

## Introdução
Este projeto em **Java** foi desenvolvido durante a aula 7 de **Programação Orientada a Objetos (POO)**. Ele simula um cadasto de novos produtos na classe `MainProduto`.

## Estrutura do Projeto 

O projeto é composto por duas classes principais: 
- **Produto**: Representa um produto, contendo todas as suas informações como valor, descrição, quantidade, ICMS, valor total.
- **MainProduto**: Classe que vai realizar o cadastro de um novo produto e mostrar na tela o todas as informações referente a essa operação.

### Atributos Principais da Classe `Produto`
- `descricao`: Representa a descrição da mercadoria.
- `valor`: Representa o valor de cada produto.
- `quantidade`: Representa o estoque de cada produto (quantos produtos irá comprar).
- `valorTotal`: Representa ao final do cadastro do novo produto ele volta o valor total referente a quantidade inserida. 
- `ICMS`: Representa o imposto relativo à circulação de mercadoria aplicado ao final da operação.

## Instalação  💻
1. Certifique-se de ter o **JDK (Java Development Kit)** instalado no seu sistema.
2. Faça o download e instale o **Eclipse IDE** ou qualquer outra IDE de desenvolvimento Java de sua escolha.
3. Clone ou faça o download dos arquivos do projeto.

```bash
git clone https://github.com/seu-usuario/exerciciosExtraPoo.git
```

## Importe o projeto para o Eclipse:
- Abra o Eclipse.
- Selecione File > Import.
- Escolha Existing Projects into Workspace.
- Selecione a pasta do projeto e importe.

## Como Usar 🌀
- Abra o projeto no Eclipse IDE.
- Execute a classe MainVeiculo clicando com o botão direito no arquivo e selecionando Run As > Java Application.
- O programa irá criar dois objetos Veiculo, configurar seus atributos, e exibir as informações no console.

## Licença ✔️
> Este projeto é de uso livre para fins acadêmicos e pessoais.

