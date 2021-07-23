package program;

public class ListaEncadeada {

	private Nodo primeiro;
	private Nodo ultimo;
	private Nodo ponteiro;

	public void add(Filme valor) {
		Nodo novoNodo = new Nodo();
		novoNodo.setValor(valor);

		if (primeiro == null && ultimo == null) {
			primeiro = novoNodo;
			ultimo = novoNodo;
		} else {
			ultimo.setProximo(novoNodo);
			ultimo = novoNodo;
		}
	}

	public void remove(String name) {
		Nodo anterior = null;
		Nodo ref = primeiro;

		while (ref != null && !ref.getValor().getName().toUpperCase().equals(name.toUpperCase())) {
			anterior = ref;
			ref = ref.getProximo();
		}

		if (ref == null) {
			IllegalArgumentException erro = new IllegalArgumentException("Dado não encontrado");
			throw erro;
		}

		if (anterior == null) {
			primeiro = ref.getProximo();
		} else {
			anterior.setProximo(ref.getProximo());
		}

	}

	public Integer size() {
		int cont = 0;

		while (hasNext()) {
			cont++;
		}
		return cont;
	}

	public boolean isEmpty() {
		if (primeiro != null)
			return false;
		else
			return true;
	}

	public void removeAll() {
		primeiro = null;
	}

	public boolean hasNext() {
		if (primeiro == null) {
			return false;
		} else if (ponteiro == null) {
			ponteiro = primeiro;
			return true;
		} else {
			boolean hasNext = ponteiro.getProximo() != null ? true : false;
			ponteiro = ponteiro.getProximo();
			return hasNext;
		}
	}

	public Nodo getPonteiro() {
		return ponteiro;
	}

	public void setPonteiro(Nodo ponteiro) {
		this.ponteiro = ponteiro;
	}

}
