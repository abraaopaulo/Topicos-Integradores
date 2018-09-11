package br.com.rpg_de_texto.leitor;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {

	private String arquivo;

	private ArrayList<String> textoPrincipal = new ArrayList();
	private ArrayList<Botao> botoes = new ArrayList();

	public Leitor(String PrimeiroArquivo) {
		this.arquivo = PrimeiroArquivo;
	}

	public Leitor() {
	}

	public void lerArquivo(String nome) {

		try {
			Scanner scan = new Scanner(new FileReader("src/teste/arquivostxt/parte1.txt"))
					.useDelimiter("\\n");

			if (scan.hasNext()) {

				String linha = scan.next();

				// pegando o texto principal
				if (linha.equals("->textoPrincipal<-")) {
					linha = scan.next();
					while (!(linha.equals("->botoes<-")) ) {
						textoPrincipal.add(linha);
						linha = scan.next();
					}
				}
				linha = scan.next();
				while (linha.equals("->texto<-")) {
					
					linha = scan.next();
					Botao bt = new Botao();
					bt.setTexto(linha);
					linha = scan.next();
				
					if (linha.equals("->proximaTela<-")) {
						linha = scan.next();
						bt.setPrximaTela(linha);
						linha = scan.next();
					}

					if (linha.equals("->vida<-")) {
						linha = scan.next();
						bt.setVida(linha);
						linha = scan.next();
					}
					if (linha.equals("->esperiencia<-")) {
						linha = scan.next();
						bt.setEsperiencia(linha);
						linha = scan.next();
					}
					if (linha.equals("->poder<-")) {
						linha = scan.next();
						bt.setPoder(linha);
						linha = scan.next();
					}
					if (linha.equals("->respeito<-")) {
						linha = scan.next();
						bt.setRespeito(linha);
						linha = scan.next();
					}
					if (linha.equals("->inventario<-")) {
						linha = scan.next();
						bt.setPrximaTela(linha);
						if(scan.hasNext())
							linha = scan.next();
					}
					botoes.add(bt);
				}
			}
			for(int i = 0; i < textoPrincipal.size(); i++ ) {
				System.out.println(textoPrincipal.get(i));
			}
			System.out.println();
			for(int i = 0; i < botoes.size(); i++ ) {
				System.out.println(">>>>>>>>>>> BOTAO "+i+"<<<<<<<<<<<<<");
				System.out.println("o texto é:"+botoes.get(i).getTexto());
				System.out.println("o proximo arquivo é:"+botoes.get(i).getPrximaTela());
				System.out.println("a vida é :"+botoes.get(i).getVida());
				System.out.println("o respeito é: "+botoes.get(i).getRespeito());
				System.out.println("a experiencia é: "+botoes.get(i).getEsperiencia());
				System.out.println("o inventario tem : "+botoes.get(i).getInventario());
				System.out.println();
			}
			scan.close();
		} catch (Exception e) {
			System.err.println("Erro ao ler arquivo: " + nome + " " + e);
		}
	}
	
	public ArrayList<String> getTextoPrincipal(){
		return textoPrincipal;
	}
	
	public ArrayList<char[]> getTextoPrincipalChar() {
		ArrayList<char[]> retorno = new ArrayList();
		for(int i= 0 ; i<textoPrincipal.size();i++) {
			retorno.add(textoPrincipal.get(i).toCharArray());
		}
		return retorno;
	}

}
