//aqui veremos um exemplo de como usar o try catch para tratar erros
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String firstName,lastName;
        int idade;
        double altura;

        try {
            System.out.println("Qual o seu nome?");
            firstName = sc.next();

            System.out.println("Qual seu sobrenome?");
            lastName = sc.next();

            System.out.println("Qual sua idade?");
            idade = sc.nextInt();

            System.out.println("Qual sua altura?");
            altura = sc.nextDouble();


            System.out.printf("Nome: %s \nSobrnome: %s \nIdade: %d \nAltura: %f ",firstName, lastName,idade,altura);

        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("No campo de altura preencha com ',' no lugar do '.' ");
        }
        

    }
}
