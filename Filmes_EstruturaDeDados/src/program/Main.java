package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		add(sc,listaEncadeada);
		System.out.println("Tamanho da lista: "+listaEncadeada.size());
		print(listaEncadeada);
		//------------------------
		System.out.println("Informe o nome de um Filme para excluir: ");
		String nome = sc.nextLine();
		listaEncadeada.remove(nome);
		System.out.println("Tamanho da lista: "+listaEncadeada.size());
		print(listaEncadeada);
		//------------------------
		System.out.println("Lista esta vazia? "+listaEncadeada.isEmpty());
		System.out.println("\nRemovendo todos os filmes");
		listaEncadeada.removeAll();
		System.out.println("Lista esta vazia? "+listaEncadeada.isEmpty());
		System.out.println("Tamanho da lista: "+listaEncadeada.size());
		
		sc.close();

	}
	
	public static void add(Scanner sc, ListaEncadeada listaEncadeada) {
		boolean op;

		do {
			System.out.print("Informe o nome do filme: ");
			String nomeFilme = sc.nextLine();			
			
			listaEncadeada.add(new Filme(nomeFilme));
			
			System.out.print("Deseja cadastrar um outro filme? s/n: ");
			char resp = sc.nextLine().charAt(0);
			op = (resp == 's') ? true : false;
		} while (op);

	}
	
	public static void print(ListaEncadeada listaEncadeada) {
		System.out.println("A lista tem os seguintes filmes: ");
		while (listaEncadeada.hasNext()) {
			System.out.println(listaEncadeada.getPonteiro().getValor().toString());
		}
	}

}

