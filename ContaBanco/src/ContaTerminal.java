import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Importar e conhecer a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pelo scanner os valores digitados no terminal

        //Exibir a mensagem conta criada


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Agencia da conta: ");
        String agenciaConta = scanner.next();

        System.out.print("Nome do cliente: ");
        String nomeConta = scanner.next();

        System.out.print("Saldo do cliente: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +  ", conta " + numeroConta + "; e seu saldo R$" + saldoConta+ " já está disponível para saque");


    }
}
