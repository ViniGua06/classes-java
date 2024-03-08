import java.util.Scanner;

public class App {

    
    public static void main (String [] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nome_cliente = scanner.next();

        System.out.println("Digite o saldo da conta!");
        double saldo = scanner.nextDouble();

        conta.setNumero(numero);
        conta.setAgencia(agencia);
        conta.setNomeCliente(nome_cliente);
        conta.setSaldo(saldo);

        conta.Apresentacao();





        
    }
}
