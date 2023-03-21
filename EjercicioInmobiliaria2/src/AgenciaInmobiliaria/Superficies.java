package AgenciaInmobiliaria;

public abstract class Superficies extends Inmueble implements precio{
	//Atributos ------------------------------------------------
	//Constructores---------------------------------------------
	public Superficies() {
		
	}
	//Métodos por defecto --------------------------------------

	@Override
	public String toString() {
		return super.toString()+ "\n Tipo Superficie ";
	}

}
