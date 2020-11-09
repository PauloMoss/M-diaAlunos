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
		
		for (int m = 0; m <= media.length -1; m++)
		{	
			media[m] = (5*NotaProva[m] + 3*NotaTrabalho[m] + 2*NotaLista[m])/10; 
		}
		
		for (int mf = 0; mf <= media.length -1; mf++)
		{	
			System.out.print("A média dos alunos será: ");
			System.out.print(media[mf]+" ");
			if (media[mf]>=8) System.out.println("Parabéns você foi Aprovado!.");
			else if (media[mf]>=3) System.out.println("Necessário fazer a prova final");
			else System.out.println("Reprovado");
			System.out.println("\n");
		}
		
		sc.close();
	}
}
