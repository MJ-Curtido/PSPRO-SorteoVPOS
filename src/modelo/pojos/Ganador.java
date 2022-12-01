package modelo.pojos;

import java.util.Objects;

public class Ganador<T, E extends Vivienda> {
	private T t;
	private E e;
	
	public Ganador(T t, E e) {
		super();
		this.t = t;
		this.e = e;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	@Override
	public int hashCode() {
		return Objects.hash(e, t);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ganador other = (Ganador) obj;
		return Objects.equals(e, other.e) && Objects.equals(t, other.t);
	}

	@Override
	public String toString() {
		return "Ganador: propietario=" + t + ", vivienda=" + e;
	}
}