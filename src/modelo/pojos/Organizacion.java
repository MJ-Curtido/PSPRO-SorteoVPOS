package modelo.pojos;

import java.util.Objects;

import enums.TipoVecinal;

public class Organizacion {
	private String nombre;
	private String nif;
	private TipoVecinal vecinal;
	
	public Organizacion(String nombre, String nif, TipoVecinal vecinal) {
		super();
		if (nif == null || nombre == null || vecinal == null) {
			throw new NullPointerException("Algún dato introducido es nulo.");
		} else {
			this.nombre = nombre;
			this.nif = nif;
			this.vecinal = vecinal;
		}
			
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public TipoVecinal getVecinal() {
		return vecinal;
	}
	
	public void setVecinal(TipoVecinal vecinal) {
		this.vecinal = vecinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organizacion other = (Organizacion) obj;
		return Objects.equals(nif, other.nif);
	}

	@Override
	public String toString() {
		return "Organizacion: nombre=" + nombre + ", nif=" + nif + ", vecinal=" + vecinal;
	}
}