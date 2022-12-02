package modelo.pojos;

import java.util.Objects;

import enums.TipoPersona;
import exceptions.ExcepcionDNI;

public class Persona {
	private String nombre;
	private String dni;
	private TipoPersona tipoPersona;
	
	public Persona(String nombre, String dni, TipoPersona tipoPersona) throws ExcepcionDNI {
		super();
		if (dni == null || nombre == null || tipoPersona == null) {
			throw new NullPointerException("Algún dato introducido es nulo.");
		} else if (dni.equals("")) {
			throw new ExcepcionDNI("El DNI no puede ser nulo ni estar vacío.");
		}
		else {
			this.dni = dni;
			this.nombre = nombre;
			this.tipoPersona = tipoPersona;
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Persona: nombre=" + nombre + ", dni=" + dni + ", tipoPersona=" + tipoPersona;
	}
}