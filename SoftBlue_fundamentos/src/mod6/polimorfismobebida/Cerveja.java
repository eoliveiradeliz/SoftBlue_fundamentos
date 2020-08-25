package mod6.polimorfismobebida;

public class Cerveja extends Bebida {
	
	public Cerveja(){
		super("Cerveja", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo");
		System.out.println("Abrindo a Geladeira e pegando a garrafa 600 Ml");
		System.out.println("Abrindo a garrafa e colocando a cerveja no copo");
	}

}
