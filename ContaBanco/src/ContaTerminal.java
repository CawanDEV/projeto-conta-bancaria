import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 1865.21;

        System.out.println("Digite seu Número de Usuário");
        int usuario = scanner.nextInt();

        System.out.println("Digite sua Agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Boa tarde Sr(a) " + nome + " Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " conta " + usuario + " e seu saldo de " + saldo +"$ já está disponivel para o saque!");

    }
}
