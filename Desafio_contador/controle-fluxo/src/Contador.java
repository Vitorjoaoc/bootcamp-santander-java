import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int parametroUm,parametroDois;

		System.out.println("Digite o primeiro parâmetro");
		parametroUm = sc.nextInt();

		System.out.println("Digite o segundo parâmetro");
        parametroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
			
		}
		
	}
	static void contar(int parametro1, int parametro2 ) throws ParametrosInvalidosException {

        int contagem = parametro2 - parametro1;
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        } else if(parametro1 == parametro2){
            System.out.println("Imprimindo número 1");
        }else {
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
		
	}

  
}