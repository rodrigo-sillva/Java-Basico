import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo ao RodBank");

       System.out.println("Digite seu número:");
       int numero = scanner.nextInt();

       System.out.println("Por favor digite sua agência:");
       String agencia = scanner.next();

       System.out.println("Digite seu nome:");
       String nomeCliente = scanner.next();

       System.out.println("Digite o valor do seu saldo:");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo no valor de " + saldo + " já está disponivel para saque.");
    }


}
