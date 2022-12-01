package modelo.pojos;

import java.util.Objects;

import enums.TipoVivienda;

public class Vivienda {
	private Integer numRegistro;
	private String direccion;
	private TipoVivienda tipoVivienda;
	
	public Vivienda(Integer numRegistro, String direccion, TipoVivienda tipoVivienda) {
		super();
		this.numRegistro = numRegistro;
		this.direccion = direccion;
		this.tipoVivienda = tipoVivienda;
	}

	public Integer getNumRegistro() {
		return numRegistro;
	}
	
	public void setNumRegistro(Integer numRegistro) {
		this.numRegistro = numRegistro;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public TipoVivienda getTipoVivienda() {
		return tipoVivienda;
	}
	
	public void setTipoVivienda(TipoVivienda tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, numRegistro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(numRegistro, other.numRegistro);
	}

	@Override
	public String toString() {
		return "Vivienda: numRegistro=" + numRegistro + ", direccion=" + direccion + ", tipoVivienda=" + tipoVivienda;
	}
}