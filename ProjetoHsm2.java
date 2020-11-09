import java.util.Scanner;
public class ProjetoHsm2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		int x = sc.nextInt();
		float [] NotaProva = new float [x];
		float [] NotaTrabalho = new float [x];
		float [] NotaLista = new float [x];

		float [] media = new float [x];
		
		
		for (int i = 0; i <= NotaProva.length -1; i++)
		{	
			System.out.print("Digite a Nota da Prova do aluno " + i + " :");
			NotaProva[i] = sc.nextFloat(); 
		}

		for (int j = 0; j <= NotaTrabalho.length -1; j++)
		{	
			System.out.print("Digite a Nota do Trabalho do aluno " + j + " :");
			NotaTrabalho[j] = sc.nextFloat(); 
		}
		
		for (int k = 0; k <= NotaLista.length -1; k++)
		{	
			System.out.print("Digite a Nota da Lista de Exercício " + k + " :");
			NotaLista[k] = sc.nextFloat(); 
		}
		
		System.out.println("\n");
		
		for (int m = 0; m <= media.length -1; m++)
		{	
			media[m] = (5*NotaProva[m] + 3*NotaTrabalho[m] + 2*NotaLista[m])/10; 
		}
		
		int alunosAp = 0;
		int alunosAf = 0;
		int alunosRp = 0;
		
		float cont = 0;
		for (int mf = 0; mf <= media.length -1; mf++)
		{	
			System.out.print("A média do aluno "+mf+" será: ");
			System.out.println(media[mf]+" ");
			cont += media[mf];
			if (media[mf]>=8) {
				alunosAp = alunosAp + 1;
				System.out.println("Parabéns você foi Aprovado!.");
			}
			else if (media[mf]>=5) {
				alunosAf = alunosAf + 1;
				System.out.println("Necessário fazer a Avaliação final");
			}
			else {
				alunosRp = alunosRp + 1;
				System.out.println("Reprovado");
			
			}
			System.out.println("\n");
		}
		
		float mgt = cont/(media.length);
		System.out.printf("A média geral da turma é de : %.2f %n ", (mgt));
		
		System.out.println("\n");
		
		float maior = 0;
		float menor = 10;

		for (int p = 0; p <= media.length -1; p++)
		{
			if (media[p]>=maior) {
				maior = media[p];
			}
			
			if (media[p]<=menor) {
				menor = media[p];
			}
			
			
		}
		System.out.printf("A maior média da turma é: %.2f %n ", (maior));
		System.out.printf("A menor média da turma é: %.2f %n ", (menor));
		
		System.out.println("\n");
		
		System.out.println("Quantidade de alunos Aprovados : "+alunosAp);
		System.out.println("Quantidade de alunos em Avaliação final : "+alunosAf);
		System.out.println("Quantidade de alunos Reprovados : "+alunosRp);
		
		sc.close();
	}
}
