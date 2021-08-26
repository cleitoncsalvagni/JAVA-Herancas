package herancas;

public class Cachorro extends Mamifero {
	private int frequenciaLatido;
	
	public void latir() {
		System.out.println("Au au!");
	}
	
	public Cachorro(){
		super("n�o informada"); // chama construtor da superclasse
		this.frequenciaLatido = 0;
	}
	
	public Cachorro(String cor, int freqLatido) {
		super(cor); // chama construtor da superclasse passando a cor
		this.frequenciaLatido = freqLatido;
	}

}
