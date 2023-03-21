package AgenciaInmobiliaria;

import java.util.Objects;

public class Solar extends Superficies{
	//Atributos ------------------------------------------------
	private boolean rustico;
	private boolean urbana;
	//Constructores---------------------------------------------
	public Solar() {
		
	}
	public Solar(boolean rustico) {
		if (this.rustico==true) {
			this.urbana=false;
		}else {
			this.rustico=false;
			this.urbana=true;
		}
	}
	//Métodos por defecto --------------------------------------
	public boolean isRustico() {
		return rustico;
	}
	public void setRustico(boolean rustico) {
		this.rustico = rustico;
	}
	public boolean isUrbana() {
		return urbana;
	}
	public void setUrbana(boolean urbana) {
		this.urbana = urbana;
	}
	@Override
	public int hashCode() {
		return Objects.hash(rustico, urbana);
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
		Solar other = (Solar) obj;
		return rustico == other.rustico && urbana == other.urbana;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n Solar rustico: " + rustico 
				+ ", urbana: " + urbana;
	}
	//Métodos propios ------------------------------------------------
	
	@Override
	public double precioM2(double precio, double m2) {
		double precioVenta=0;
		precioVenta=precio*m2;
		return precioVenta;
	}
	
}
