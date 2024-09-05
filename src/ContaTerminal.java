import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
      int numero;
      String agencia;
      String nomeCliente;
      double saldo;

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite o número da conta: ");
      numero = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Digite a agência: ");
      agencia = scanner.nextLine();
      System.out.println("Digite o nome do Cliente: ");
      nomeCliente = scanner.nextLine();
      System.out.println("Digite o seu saldo: ");
      saldo = scanner.nextDouble();
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
