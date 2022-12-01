package modelo.pojos;

import java.util.Objects;

import enums.TipoPersona;

public class Persona {
	private String nombre;
	private String dni;
	private TipoPersona tipoPersona;
	
	public Persona(String nombre, String dni, TipoPersona tipoPersona) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.tipoPersona = tipoPersona;
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