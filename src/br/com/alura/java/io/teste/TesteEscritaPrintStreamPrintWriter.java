package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt"); 
//		Writer osw = new OutputStreamWriter(fos); 
//		BufferedWriter bw = new BufferedWriter(osw); 
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
//		PrintStream ps = new PrintStream("lorem2.txt"); Usados em saídas;
		PrintWriter ps = new PrintWriter("lorem2.txt"); //Não usa o STREAM por debaixo dos panos;
				
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println();
		ps.println("Oláaa hasdhasjd hasjdhajshd asjhd ajshdjas");


		ps.close();
		
		
	}

}
	