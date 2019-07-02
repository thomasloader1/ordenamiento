package ar.edu.unlam.pb2.parcial;

import java.util.*;
import java.util.List;

public class Facultad {
	
	private List<Persona> miListaDePersonas;
	
	public Facultad() {
		this.miListaDePersonas = new ArrayList<Persona>();
	}
	
	public void agregarPersona(Persona p) {
		miListaDePersonas.add(p);
	}
	
	public Integer mostrarCantidadDeAlumnos() {
		return this.miListaDePersonas.size();
	}
	
	public List<Persona> mostrarContenido(){
		return this.miListaDePersonas;
	}

}
