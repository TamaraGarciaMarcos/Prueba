package AgenciaInmobiliaria;

import java.util.Objects;

public abstract class Construcciones extends Inmueble implements precio{

	//Atributos ------------------------------------------------
	protected boolean nueva;
	protected boolean segundaMano;
	//Constructores---------------------------------------------
	public Construcciones() {
		
	}
	public Construcciones(boolean nueva) {
		if (this.nueva==true) {
			this.segundaMano=false;
		}else {
			this.nueva=false;
			this.segundaMano=true;
		}
	}
	//Métodos por defecto --------------------------------------
	public boolean isNueva() {
		return nueva;
	}
	public void setNueva(boolean nueva) {
		this.nueva = nueva;
	}
	public boolean isSegundaMano() {
		return segundaMano;
	}
	public void setSegundaMano(boolean segundaMano) {
		this.segundaMano = segundaMano;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nueva, segundaMano);
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
		Construcciones other = (Construcciones) obj;
		return nueva == other.nueva && segundaMano == other.segundaMano;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n Tipo: Construcciones"
				+"\n nueva: " + nueva + ", segundaMano: " + segundaMano;
	}
	
	
}
