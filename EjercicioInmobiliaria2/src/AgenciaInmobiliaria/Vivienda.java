package AgenciaInmobiliaria;

import java.util.Objects;

public class Vivienda extends Construcciones{
	//Atributos ------------------------------------------------
	private int numhabt;
	private int piso;
	//Constructores---------------------------------------------
	public Vivienda() {
		
	}
	public Vivienda(int numhabt,int piso) {
		this.numhabt=numhabt;
		this.piso=piso;
	}
	//Métodos por defecto --------------------------------------
	public int getNumhabt() {
		return numhabt;
	}
	public void setNumhabt(int numhabt) {
		this.numhabt = numhabt;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numhabt, piso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vivienda other = (Vivienda) obj;
		return numhabt == other.numhabt && piso == other.piso;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n Vivienda numero de habitaciones: " + numhabt 
				+ ", piso: " + piso;
	}
	
	//Métodos propios ------------------------------------------------
	@Override
	public double precioM2(double precio, double m2) {
		double precioVenta=0;
		precioVenta=precio*m2;
		return precioVenta;
	}
	
}
