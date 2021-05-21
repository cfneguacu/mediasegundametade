package mediasegundametade;

import java.util.Scanner;

public class MediaSegundaMetade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double soma = 0 ;
		int tamanho = 1;
		System.out.println("Digite o numero de valores que deseja calcular");
		
		do {
			tamanho = entrada.nextInt();
			if(tamanho%2==0) {
				
				
				double quantidade[] = new double[tamanho];
				double media = 0;
				double temp = tamanho/2;
				
				for(int i = 0; i<tamanho;i++) {
					System.out.println("Digite um numero");
					quantidade[i] = entrada.nextDouble();
					if(i>=temp) {
						soma = soma+quantidade[i];
					}
				}
				
				media = soma/temp;
				System.out.print("Media= "+media);
				break;
				}
			System.out.println("O numero digitado deve ser par, digite novamente");
		}while(tamanho%2==1);
	}

}
