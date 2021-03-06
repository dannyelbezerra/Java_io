package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		/*Primeiro, criamos o fluxo concreto com o arquivo, mas ainda bin?rio, em seguida, 
		 * conseguimos transforma-los em caracteres, mas apenas a contabiliza??o, por fim, 
		 * com o BufferedReader, podemos utilizar o m?todo readLine(), que nos permite ler linha a linha. 
		 * O BufferedReadr, ? capaz de ler as linhas inteiras de um arquivo de texto, 
		 * Guarda os caracteres at? preencher uma linha;
		 * Este m?todo nos retorna uma String, que representa a linha;
		 * 
		 */
		
		
		FileInputStream fis = new FileInputStream("lorem.txt"); //Criou o fluxo de entrada com arquivos;
		InputStreamReader isr = new InputStreamReader(fis); //transforma bytes and bits em caracteres;
		BufferedReader br = new BufferedReader(isr); //serve para leitura de uma InputStreamReader; 
		//o FileInputStream herda da classe InputStream e o InputStreamReader e BufferedReader, herdam da classe Reader, podendo alterar as classes, deixando mais gen?rico;
		
		String linha = br.readLine(); //Faz a leitura linha a linha;
		
		// Conte?do significa que a linha n?o ? Null;
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
		
		
	}

}
	