package Aula44;

import java.util.Scanner;

public class extruturaWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int x=sc.nextInt();
		int soma=0;
		
		while(x!=0){
			soma+=x;
			x=sc.nextInt();
		}
		
		System.out.println("A soma dos n�meros digitados foi: "+soma);
		sc.close();
	}

}
