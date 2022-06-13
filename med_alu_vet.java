package media_aluno_vet;

import java.util.Scanner;

public class med_alu_vet {

	public static void main(String[] args) {
		Scanner batman = new Scanner(System.in);

		int n = 6;
		int s[] = new int[n];
		int i;
		System.out.println("informe Quantos Alunos tem nas Salas:");
		for (i = 0; i < n; i++) {
			System.out.printf("Sala %d: ", (i + 1), n);
			s[i] = batman.nextInt();
			
		}

		int soma = 0;
		int menor = s[0];
		int maior = s[0];

		for (i = 0; i < n; i++) {
			soma = soma + s[i];
			if (s[i] < menor)
				menor = s[i];
			if (s[i] > maior)
				maior = s[i];

		}
		System.out.println();
		System.out.printf("\nMedia de Alunos = %d\n", (soma / n));
		System.out.println();
		batman.close();
		for (i = 0; i < n; i++) {
			if (s[i] < (soma / n))
				System.out.printf("Sala %d = %2d <--- Sala com MENOR numero da media de alunos\n", i, s[i]);
			else if (s[i] > (soma / n))
				System.out.printf("Sala %d = %2d <--- Sala com MAIOR numero da media de alunos\n", i, s[i]);
			
		}
		
	}
	
}
