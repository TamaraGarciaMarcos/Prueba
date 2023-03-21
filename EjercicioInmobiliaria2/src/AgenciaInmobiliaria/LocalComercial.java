package AgenciaInmobiliaria;

public class LocalComercial extends Construcciones{
	//Atributos ------------------------------------------------
	
	//Constructores---------------------------------------------
	public LocalComercial() {
		
	}
	//Métodos por defecto --------------------------------------

	@Override
	public String toString() {
		return  super.toString()+ "\n LocalComercial";
	}
	//Métodos propios ------------------------------------------------
	@Override
	public double precioM2(double precio, double m2) {
		double precioAlquiler=0;
		precioAlquiler=precio*m2;
		return precioAlquiler;
	}
}
