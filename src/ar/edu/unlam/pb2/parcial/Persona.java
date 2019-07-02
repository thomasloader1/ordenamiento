package ar.edu.unlam.pb2.parcial;

public class Persona implements Comparable<Persona>{

	private String dni, nombre, apellido;
	private Integer edad;

	public Persona(String dni, String nombre, String apellido, Integer edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona p) {
		return this.edad.compareTo(p.getEdad());
	}

}
