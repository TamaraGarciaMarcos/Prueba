package AgenciaInmobiliaria;

import java.util.ArrayList;

public class ListadoInmuebles {
	//Atributos ---------------------------------------------------
	private ArrayList <Inmueble> venta;
	private ArrayList <Inmueble> alquiler;
	//Constructores------------------------------------------------
	public ListadoInmuebles() {
		venta= new ArrayList<Inmueble>();
		alquiler = new ArrayList<Inmueble>();
	}
	//Métodos por defecto------------------------------------------
	public ArrayList<Inmueble> getVenta() {
		return venta;
	}
	public void setVenta(ArrayList<Inmueble> venta) {
		this.venta = venta;
	}
	public ArrayList<Inmueble> getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(ArrayList<Inmueble> alquiler) {
		this.alquiler = alquiler;
	}
	//Métodos propios ---------------------------------------------
	//-> método para que me añada inmuebles que se pueden vender.
	public void añadeVentaInmueble(Inmueble inm) {
		boolean repetido=false;
		if((venta.size()==0)||(venta==null) ){
			venta.add(inm);
		}else {
			//foreach que recorre la lista y comprueba si se repite el inmueble.
			for(Inmueble l:venta) {
				if(inm.equals(l)==true) {
					repetido=true;
				}
			}
			//Si se repite lo avisa por consola
			if(repetido==true) {
				System.out.println("El inmueble que desea registrar está repetido.");
			//Si no se repite 
			}else {
				venta.add(inm);
			}
		}
	}
	//-> método para añadir inmuebles que se pueden alquilar
	public void añadeAlquilerInmueble(Inmueble inm) {
		boolean repetido=false;
		if((alquiler.size()==0)||(alquiler==null)) {
			alquiler.add(inm);
		}else {
			//foreach que recorre la lista y comprueba si se repite el inmueble.
			for(Inmueble l:alquiler) {
				if(inm.equals(l)==true) {
					repetido=true;
				}
			}
			//Si se repite lo avisa por consola
			if(repetido==true) {
				System.out.println("El inmueble que desea registrar está repetido.");
			//Si no se repite 
			}else {
				alquiler.add(inm);
			}
		}
	}
	
	//->método para que muestre los locales de segunda mano.
	public void localesSegundaMano(double m2) {
		for(Inmueble l:alquiler) {
			//se comprueba si el inmueble de la lista es un local comercial
			if(l instanceof LocalComercial) {
				//Se almacena el local en una variable para obterner los atributos
				LocalComercial local= (LocalComercial) l;
				if(local.segundaMano==true) {
					if(local.m2>m2) {
						System.out.println(local);
					}
				}
			}
		}
	}
	//->método para que muestre cuántos solares rústicos están en venta.
	public void solaresRusticos() {
		int cont=0;
		for(Inmueble l:venta) {
			//Se comprueba que el inmueble es un solar.
			if(l instanceof Solar) {
				//Se almacena en una variable para obtener los atributos.
				Solar solar = (Solar) l;
				if (solar.isRustico()==true) {
					cont= cont + 1;
				}
			}
		}
		System.out.println("Hay "+cont + " solares rústicos en venta.");
	}
}



















