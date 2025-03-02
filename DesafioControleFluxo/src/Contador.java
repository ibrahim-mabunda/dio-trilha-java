import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
		
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
		
			} catch (ParametrosInvalidosException exception) {
				System.out.println(exception.getMessage());
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			}
		}
	}
	
	// Define a classe ParametrosInvalidosException
	static class ParametrosInvalidosException extends Exception {
		public ParametrosInvalidosException(String message) {
			super(message);
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a excepção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		// Calcular a quantidade de interações
		int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem
		for (int i = 1; i <= contagem; i++) {
			System.out.println("imprimindo o número " + i);
		}
	}
}
