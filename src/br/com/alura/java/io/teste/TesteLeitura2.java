package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); //pode usar também da seguinte maneira: Locale.setDefault(Locale.US);
			linhaScanner.useDelimiter(","); //o método useDelimiter, respeita determinando critério de separação das informações, que em nosso caso é a vírgula (,);
			
			 String valor1 = linhaScanner.next(); //o método next, retorna o próximo item do arquivo, uma String;
             int valor2 = linhaScanner.nextInt();
             int valor3 = linhaScanner.nextInt();
             String valor4 = linhaScanner.next();
             double valor5 = linhaScanner.nextDouble();
             
//             String valorFormatado = String.format("%s - %d-%d, %s: %f", valor1, valor2, valor3, valor4, valor5);
//             System.out.println(valorFormatado); Outra maneira de imprimir os valores formatados;
             System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %08.2f%n", valor1, valor2, valor3, valor4, valor5);

             linhaScanner.close();
			
			
/*o método split() contido nesta classe, cuja função é separar uma String grande em pedaços menores.
 * O método split() recebe como parâmetro uma String do tipo regex, 
 * que é um conjunto de caracteres que define regras de como analisar, ou separar, uma String maior. 
 * No nosso caso, a regra de divisão é simplesmente a vírgula
 */

//			String [] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			
			
		}
		scanner.close();
	}	

}

