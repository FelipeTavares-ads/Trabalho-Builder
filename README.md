# Padrão de Projeto Builder
Trabalho realizado por Felipe Tavares de Jesus para a matéria de Padrões de Projeto do Professor Fabinho.

## Estrutura do Projeto
O código está organizado seguindo os papéis do padrão Builder:

### Produto (BoletoPadrao): A classe que contém os dados finais do boleto (Sacado, Cedente, Valor, etc.).

### Interface Builder (BoletoBuilder): Define o contrato de construção para todos os bancos.

### Builders Concretos: Classes como ItauBoletoBuilder e BradescoBoletoBuilder que implementam as regras específicas de cada instituição.

### Diretor (GeradorBoletos): Classe que comanda a ordem de construção do boleto.

## Regras de Negócio e Validações
O projeto segue as normas da FEBRABAN e as particularidades de cada banco:

Validação de Valor: Impede a geração de boletos com valor negativo ou igual a zero.

Nosso Número: Valida o tamanho do campo de acordo com o banco (ex: 8 dígitos para Itaú e 11 para Bradesco).

Identificação Bancária: Insere automaticamente o código de compensação (ex: 341 para Itaú).

## Como Executar
Clona o repositório.

Compila as classes Java.

Executa a classe Main.java para ver o exemplo de geração de boleto no terminal.
