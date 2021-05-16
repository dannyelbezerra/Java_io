package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); 
		
		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		//Para simplificarmos o código, podemos mover a criação do FileWriter diretamente para o BufferedWriter;
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("hello hasdhasjd hasjdhajshd asjhd ajshdjas");
		
//		fw.write(System.lineSeparator());//cria uma nova linha em branco;
//		fw.write(System.lineSeparator());
//		fw.write(System.lineSeparator());
//		fw.write("hello hasdhasjd hasjdhajshd asjhd ajshdjas");

		bw.close();
		
		
	}

}
	