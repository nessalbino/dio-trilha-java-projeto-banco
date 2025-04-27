import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    // TO DO: Conhecer e importar a classe Scanner

    // Exibir as mensagens para nosso usuário

    // Obter pela scanner os valores digitados no terminal

    // Exibir a mensagem conta criada

    // Criando o objeto scanner

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor " + nome + " digite sua agência");
        String agencia = scanner.next();

        System.out.println("Agora digite o n. da sua conta corrente sem o dígito");
        int contaCorrente = scanner.nextInt();

        System.out.println("Agora digite o valor do depósito");
        double valorPrimeiroDeposito = scanner.nextDouble();

        double saldo = valorPrimeiroDeposito;

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("sua Agência é " + agencia + " sua conta corrente é " + contaCorrente + ".");
        System.out.println("Seu saldo no valor de R$ " + saldo + " está disponível para saque");

    }
}
