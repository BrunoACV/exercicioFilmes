package program;

public class Filme {

	private String name;

	public Filme() {

	}

	public Filme(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Filme: " + name;
	}
	
	
}

