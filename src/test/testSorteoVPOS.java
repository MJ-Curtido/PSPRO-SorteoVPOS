package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import enums.TipoPersona;
import enums.TipoVecinal;
import enums.TipoVivienda;
import exceptions.ExcepcionDNI;
import modelo.pojos.Ganador;
import modelo.pojos.Organizacion;
import modelo.pojos.Persona;
import modelo.pojos.Vivienda;

public class testSorteoVPOS {
	public static void main(String[] args) {
		ArrayList<Object> listaAspirantes = new ArrayList<Object>();
		ArrayList<Vivienda> listaViviendas = new ArrayList<Vivienda>();
		
		try {
			Vivienda viv1 = new Vivienda(1, "direccion1", TipoVivienda.PISO);
			listaViviendas.add(viv1);
			Vivienda viv2 = new Vivienda(2, "direccion2", TipoVivienda.CASA);
			listaViviendas.add(viv2);
			Vivienda viv3 = new Vivienda(3, "direccion3", TipoVivienda.PISO);
			listaViviendas.add(viv3);
			Vivienda viv4 = new Vivienda(4, "direccion4", TipoVivienda.CASA);
			listaViviendas.add(viv4);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Persona pers1 = new Persona("NombreP1", "11111111P", TipoPersona.CON_HIJOS);
			listaAspirantes.add(pers1);
			Persona pers2 = new Persona("NombreP2", "22222222P", TipoPersona.MINUSVALIDO);
			listaAspirantes.add(pers2);
			Persona pers3 = new Persona("NombreP3", "33333333P", TipoPersona.SIN_HIJOS);
			listaAspirantes.add(pers3);
			Persona pers4 = new Persona("NombreP4", "44444444P", TipoPersona.CON_HIJOS);
			listaAspirantes.add(pers4);
			Persona pers5 = new Persona("NombreP5", "55555555P", TipoPersona.MINUSVALIDO);
			listaAspirantes.add(pers5);
			Persona pers6 = new Persona("NombreP6", "66666666P", TipoPersona.SIN_HIJOS);
			listaAspirantes.add(pers6);
			Persona pers7 = new Persona("NombreP7", "77777777P", TipoPersona.CON_HIJOS);
			listaAspirantes.add(pers7);
		} catch (ExcepcionDNI e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Organizacion org1 = new Organizacion("NombreO1", "11111111O", TipoVecinal.BARRIADA_ESPANYA);
			listaAspirantes.add(org1);
			Organizacion org2 = new Organizacion("NombreO2", "22222222O", TipoVecinal.EL_PELIRON);
			listaAspirantes.add(org2);
			Organizacion org3 = new Organizacion("NombreO3", "33333333O", TipoVecinal.LA_GRANJA);
			listaAspirantes.add(org3);
			Organizacion org4 = new Organizacion("NombreO4", "44444444O", TipoVecinal.BARRIADA_ESPANYA);
			listaAspirantes.add(org4);
			Organizacion org5 = new Organizacion("NombreO5", "55555555O", TipoVecinal.EL_PELIRON);
			listaAspirantes.add(org5);
			Organizacion org6 = new Organizacion("NombreO6", "66666666O", TipoVecinal.LA_GRANJA);
			listaAspirantes.add(org6);
			Organizacion org7 = new Organizacion("NombreO7", "77777777O", TipoVecinal.BARRIADA_ESPANYA);
			listaAspirantes.add(org7);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		ArrayList<Object> listaSorteo = new ArrayList<Object>();
		ArrayList<Ganador<Object, Vivienda>> listaGanadores = new ArrayList<Ganador<Object, Vivienda>>();
		
		for (int i = 0; i < listaAspirantes.size(); i++) {
			if (listaAspirantes.get(i) instanceof Persona) {
				Persona persona = (Persona) listaAspirantes.get(i);
				
				if (persona.getTipoPersona() == TipoPersona.CON_HIJOS) {
					for (int j = 0; j < 3; j++) {
						listaSorteo.add(listaAspirantes.get(i));
					}
				}
				else if (persona.getTipoPersona() == TipoPersona.MINUSVALIDO) {
					for (int j = 0; j < 2; j++) {
						listaSorteo.add(listaAspirantes.get(i));
					}
				}
				else {
					listaSorteo.add(listaAspirantes.get(i));
				}
			}
			else {
				listaSorteo.add(listaAspirantes.get(i));
			}
		}
		
		for (int i = 0; i < listaViviendas.size(); i++) {
			Collections.shuffle(listaSorteo);
			
			Object aspirante = listaSorteo.remove(i);
			
			listaGanadores.add(new Ganador<Object, Vivienda>(aspirante, listaViviendas.get(i)));
		}
		
		for (int i = 0; i < listaGanadores.size(); i++) {
			System.out.println(listaGanadores.get(i).toString());
		}
	}
}