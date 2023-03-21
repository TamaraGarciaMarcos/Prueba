package AgenciaInmobiliaria;

import java.util.Objects;

public class PlazaGaraje extends Superficies{
	//Atributos ------------------------------------------------
	private boolean privado;
	private boolean publico;
	//Constructores---------------------------------------------
	public PlazaGaraje() {
		
	}
	public PlazaGaraje(boolean privado) {
		if (this.privado==true) {
			this.publico=false;
		}else {
			this.privado=false;
			this.publico=true;
		}
	}
	//Métodos por defecto --------------------------------------
	public boolean isPrivado() {
		return privado;
	}
	public void setPrivado(boolean privado) {
		this.privado = privado;
	}
	public boolean isPublico() {
		return publico;
	}
	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	@Override
	public int hashCode() {
		return Objects.hash(privado, publico);
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
		PlazaGaraje other = (PlazaGaraje) obj;
		return privado == other.privado && publico == other.publico;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n PlazaGaraje privado: " + privado +", publico: " + publico;
	}

	//Métodos propios ------------------------------------------------
	@Override
	public double precioM2(double precio, double m2) {
		double precioAlquiler=0;
		precioAlquiler=precio*m2;
		return precioAlquiler;
	}
	
	
}
