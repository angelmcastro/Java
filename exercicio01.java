package aula01;

 //Angela Mendonça - ex 01

import java.util.Scanner;


public class exercicio01 {

	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, calculoIdadeDias;

		Scanner leitor = new Scanner(System.in);

		System.out.println("\nINFORME SUA IDADE EM ANOS, MESES E DIAS E OBTENHA A IDADE APENAS EM DIAS");
		System.out.println("\n--------------------------------------------------");

		System.out.println("\nANOS: ");
		idadeAnos = leitor.nextInt();

		System.out.println("\nMESES: ");
		idadeMeses = leitor.nextInt();

		System.out.println("\nDIAS: ");
		idadeDias = leitor.nextInt();

		calculoIdadeDias = ((idadeAnos * 365) + (idadeMeses * 30) + idadeDias);

		System.out.println("\nA sua idade total em dias = " + calculoIdadeDias + " dias");

		leitor.close();
	}

}
