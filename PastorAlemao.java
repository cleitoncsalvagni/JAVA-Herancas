package herancas;

public class PastorAlemao extends Cachorro {
	private int areaCaca;
	
	public void cacar() {
		System.out.println("Estou ca�ando!");
	}
	
/*	@Override
	public void latir() {
	System.out.println("Woof Woof!");
	} */

	public void latir() {
		super.latir(); // Imprime "Au au!"
		System.out.println("Terminei o latido");
		}
	
	public PastorAlemao() {
		// Chamando o construtor sem par�metros da classe Cachorro
		super();
		// Agora inicializamos as propriedades da classe
		// PastorAlemao
		this.areaCaca = 13;
		}
}
