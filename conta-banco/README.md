# ContaTerminal

### Explicação do Código: `ContaTerminal.java`

O código fornecido é um programa Java simples que simula a criação de uma conta bancária através do terminal. A seguir, uma explicação detalhada de cada parte do código:

#### Importação de Bibliotecas

```java
import java.util.Scanner;
```
*O programa importa a classe Scanner da biblioteca java.util, que é utilizada para ler a entrada do usuário a partir do console.*

#### Declaração da Classe

```java
public class ContaTerminal {
    public static void main(String[] args) {
```
*A classe `ContaTerminal` contém o método `main`, que é o ponto de entrada do programa. O método `main` é onde a execução do programa começa.*

#### Criação do Scanner

```java
Scanner scanner = new Scanner(System.in);
```
*Um objeto `Scanner` é criado para ler a entrada do usuário a partir do console.*

#### Coleta de Dados do Usuário

```java
System.out.println("Por favor, digite o número da Agência:");
String agencia = scanner.nextLine();

System.out.println("Por favor, digite o número da Conta:");
int numero = scanner.nextInt();
scanner.nextLine(); // Consumir a nova linha

System.out.println("Por favor, digite o nome do Cliente:");
String nomeCliente = scanner.nextLine();

System.out.println("Por favor, digite o saldo:");
double saldo = scanner.nextDouble();
```
*O programa solicita ao usuário que insira o número da agência, o número da conta, o nome do cliente e o saldo inicial. Os dados são lidos e armazenados em variáveis apropriadas.*

#### Formatação e Exibição da Mensagem

```java
String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
    nomeCliente, agencia, numero, saldo);

System.out.println(mensagem);
```
*Uma mensagem de confirmação é formatada usando `String.format` e exibida no console. A mensagem inclui o nome do cliente, o número da agência, o número da conta e o saldo inicial.*

#### Fechamento do Scanner

```java
scanner.close();
```
*O objeto `Scanner` é fechado para liberar os recursos associados a ele.*

### Resumo

**Este programa Java interage com o usuário para coletar informações sobre uma nova conta bancária e, em seguida, exibe uma mensagem de confirmação com os detalhes fornecidos. É um exemplo simples de como usar a classe `Scanner` para ler entradas do usuário e formatar uma string para exibição.**