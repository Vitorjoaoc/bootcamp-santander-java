import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia,nomeCliente;
        Double saldo;
        Scanner sc = new Scanner(System.in);
        System.out.println("BANCO JAVA");

        System.out.println("Vamos abri uma conta no Banco!");
         //Criaremos a conta

         System.out.println("Nome do Cliente");
         nomeCliente = sc.nextLine();
         System.out.println("Qual o numero da conta?");
         numero = sc.nextInt();
         System.out.println("Qual a agencia da conta?");
         agencia = sc.next();
         System.out.println(agencia);
         System.out.println("Saldo da Conta");
         saldo = sc.nextDouble();

         Conta conta01 = new Conta(numero, agencia, nomeCliente, saldo);

         System.out.println("\nExibindo a conta com uma formatação mais legivel");
         conta01.exibir();

    }
}
