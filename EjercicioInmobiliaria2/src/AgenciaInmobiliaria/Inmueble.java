package AgenciaInmobiliaria;

import java.util.Objects;

public class Inmueble {
	//Atributos ------------------------------------------------
	protected String ubicacion;
	protected double m2;
	protected double precio;
	
	//Constructores---------------------------------------------
	public Inmueble() {
		
	}
	public Inmueble(String ubicacion, double m2, double precio) {
		this.ubicacion=ubicacion;
		this.m2=m2;
		this.precio=precio;
	}
	//Métodos por defecto -------------------------------------
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Inmueble ubicacion: " + ubicacion + ", m2: " + m2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(m2, ubicacion);
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
		Inmueble other = (Inmueble) obj;
		return Double.doubleToLongBits(m2) == Double.doubleToLongBits(other.m2)
				&& Objects.equals(ubicacion, other.ubicacion);
	}
	
	
	
}
