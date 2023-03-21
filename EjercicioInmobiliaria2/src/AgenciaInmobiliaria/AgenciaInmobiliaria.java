package AgenciaInmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaInmobiliaria {

	//Atributos ------------------------------------------------
	private String nombre;
	private String cif;
	private int telefono;
	private ArrayList <Inmueble> listaAgencia;
	//Constructores---------------------------------------------
	public AgenciaInmobiliaria() {
		listaAgencia=new ArrayList<Inmueble>();
	}
	//Métodos por defecto --------------------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Inmueble> getInmuebleAgencia() {
		return listaAgencia;
	}
	public void setInmuebleAgencia(ArrayList<Inmueble> inmuebleAgencia) {
		this.listaAgencia = inmuebleAgencia;
	}
	@Override
	public String toString() {
		return "Agencia Inmobiliaria: "+ "\n Nombre: " + nombre 
				+ "\n  cif: " + cif 
				+ "\n  telefono: " + telefono 
				+ "\n  inmuebles de la Agencia: " + listaAgencia;
	}
	//Métodos propios ----------------------------------------------
	
	
		//-> Este método comprueba que el inmueble que se quiere meter en la lista
		// está o no registrado ya.
	public void añadirInmueble(Inmueble inm) {
		boolean repetido=false;
		if((listaAgencia.size()==0)||(listaAgencia==null)) {
			listaAgencia.add(inm);
		}else {
			//foreach que recorre la lista y comprueba si se repite el inmueble.
			for(Inmueble l:listaAgencia) {
				if(inm.equals(l)==true) {
					repetido=true;
				}
			}
			//Si se repite lo avisa por consola
			if(repetido==true) {
				System.out.println("El inmueble que desea registrar está repetido.");
			//Si no se repite 
			}else {
				listaAgencia.add(inm);
			}
		}
	}
	//->método para fusionar agencias.
	public AgenciaInmobiliaria fusion(AgenciaInmobiliaria ag) {
		Scanner datos = new Scanner(System.in);
		AgenciaInmobiliaria nueva = new AgenciaInmobiliaria();
		System.out.println("Fusión de agencias");
		System.out.println("Indique el nombre de la nueva agencia: ");
		nueva.setNombre(datos.next());
		System.out.println("Indique el CIF de la nueva agencia: ");
		nueva.setCif(datos.next());
		System.out.println("Indique el teléfono de la nueva agencia: ");
		nueva.setTelefono(datos.nextInt());
		//se añade a la lista de la nueva agencia el contenido de las listas de las agencias
		nueva.listaAgencia.addAll(this.listaAgencia);
		nueva.listaAgencia.addAll(ag.listaAgencia);
		
		datos.close();
		return nueva;
	}
	
}
