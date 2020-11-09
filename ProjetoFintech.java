import java.util.Scanner;
public class ProjetoFintech {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float Valor [][] = new float [4][7];
		float mediaSem [] = new float [4];
		float mediaMensal = 0;
		
		for (int i = 0; i <= 4 -1; i++)
		{	
			for (int j = 0; j <= 7 -1; j++)
			{	
				System.out.println("Digite o Valor da ação na semana "+i+" no dia "+j+" :");
				Valor[i][j] = sc.nextFloat(); 
			}
		}
		
		float cont [] = new float [4];
		for (int k = 0; k <= 4 -1; k++)
		{	
			for (int l = 0; l <= 7 -1; l++)
			{	
				cont [k] = cont [k] + Valor[k][l];		
			}
		mediaSem [k] = cont [k]/7;
		System.out.println("A média da semana "+k+" será: "+mediaSem [k]);
		}
		
		float maior = 0;
		float menor = 999999;

		for (int p = 0; p <= mediaSem.length -1; p++)
		{
			if (mediaSem[p]>=maior) {
				maior = mediaSem[p];
			}
			
			if (mediaSem[p]<=menor) {
				menor = mediaSem[p];
			}
			
			
		}
		
		System.out.println("\n");
		
		System.out.printf("A maior média semanal é: %.2f %n ", (maior));
		System.out.printf("A menor média semanal é: %.2f %n ", (menor));
		
		System.out.println("\n");
		
		
		for (int m = 0; m <= 4 -1; m++)
		{	
			mediaMensal = mediaMensal + mediaSem[m]/4;
		}
		System.out.println("A média Mensal será: "+mediaMensal);
		
		sc.close();
		
	}
	

}
