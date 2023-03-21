package AgenciaInmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("** Inicio de programa **");
		System.out.println(" ");
		
		Scanner datos = new Scanner(System.in);
		
		ArrayList <Inmueble> listaAgencia1 = new ArrayList<Inmueble>();
		ArrayList <Inmueble> listaAgencia2 = new ArrayList<Inmueble>();
		AgenciaInmobiliaria agencia1 = new AgenciaInmobiliaria();
		AgenciaInmobiliaria agencia2 = new AgenciaInmobiliaria();
		//
		Solar solar1 = new Solar(true);
		solar1.setM2(1200);
		solar1.setPrecio(2000);
		System.out.println(solar1.toString());
		//
		PlazaGaraje plaza1 = new PlazaGaraje (true);
		plaza1.setM2(5);
		plaza1.setPrecio(120);
		System.out.println(plaza1.toString());
		//
		Vivienda vivienda1 = new Vivienda ();
		vivienda1.setM2(70);
		vivienda1.setPrecio(222000);
		System.out.println(vivienda1.toString());
		//
		LocalComercial local1 = new LocalComercial();
		local1.setM2(1000);
		local1.setPrecio(1000);
		System.out.println(local1.toString());
		
		
		System.out.println(solar1.precioM2(solar1.getPrecio(),solar1.getM2()));
		agencia1.añadirInmueble(local1);
		agencia1.añadirInmueble(solar1);
		agencia1.añadirInmueble(vivienda1);
		agencia1.añadirInmueble(plaza1);
		agencia2.añadirInmueble(local1);
		agencia2.añadirInmueble(solar1);
		agencia2.añadirInmueble(vivienda1);
		agencia2.añadirInmueble(plaza1);
		System.out.println(agencia1.toString());
		System.out.println(agencia2.toString());
		
		System.out.println(" ");
		System.out.println("** Fin del programa **");
		
	}

}
