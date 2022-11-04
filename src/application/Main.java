package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("qtde de linhas: ");
		int l = sc.nextInt();
		System.out.print("qtde de colunas: ");
		int c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		System.out.println();
		System.out.println("inserir dados:");
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("qual numero");
		int num = sc.nextInt();
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (num == matriz[i][j]) {
					System.out.println("POSICAO [" + i + "][" + j + "]");
					//esquerda
					if (j > 0) {
						System.out.println("ESQ: " + matriz[i][j-1]);
					}
					//direita
					if (j < (c-1)) {
						System.out.println("DIR: " + matriz[i][j+1]);
					}
					//acima
					if (i > 0) {
						System.out.println("ACIMA: " + matriz[i-1][j]);
					}
					//abaixo
					if (i < (l-1) ){
						System.out.println("ABAIXO: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
