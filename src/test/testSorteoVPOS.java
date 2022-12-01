package test;

import enums.TipoPersona;
import enums.TipoVivienda;
import modelo.pojos.Ganador;
import modelo.pojos.Persona;
import modelo.pojos.Vivienda;

public class testSorteoVPOS {
	Ganador<Persona, Vivienda> ganador = new Ganador<Persona, Vivienda>(
			new Persona("Manu", "77777777P", TipoPersona.CON_HIJOS),
			new Vivienda(7, "Colonia de Caulina, nº60, pª2", TipoVivienda.PISO));
}