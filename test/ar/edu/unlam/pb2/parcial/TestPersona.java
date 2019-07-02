package ar.edu.unlam.pb2.parcial;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestPersona {

	@Test
	public void testQueAgregarPersonasAUnArraylist() {
		
		Persona elNahue = new Persona("1111111","El Nahue", "Gorgoro", 2);
		Facultad laMatanza = new Facultad();
		
		laMatanza.agregarPersona(elNahue);
		
		Integer actual = laMatanza.mostrarCantidadDeAlumnos();
		Integer esperado = 1;
		
		assertEquals(esperado, actual);
		
	}
	
	@Test
	public void testQueOrdenaPorEdad() {
		
		Persona elNahue = new Persona("1111111","El Nahue", "Gorgoro", 99);
		Persona elLuca = new Persona("1111111","El Luca", "Gorgoro", 3);
		Persona laSolange = new Persona("1111111","La Sole", "Gorgoro", 44);
		Persona elDiego = new Persona("1111111","El Diego", "Gorgoro", 26);
		Persona elTomi = new Persona("123456789", "El Tomo", "PijaLarga", 1);
		
		/*List<Persona> misPersonas = new ArrayList<Persona>();
		misPersonas.add(elNahue);
		misPersonas.add(elLuca);
		misPersonas.add(laSolange);
		misPersonas.add(elDiego);*/
		
		Facultad laMatanza = new Facultad();
		
	//laMatanza.mostrarContenido().addAll(misPersonas);
		
		laMatanza.agregarPersona(elNahue);
		laMatanza.agregarPersona(elLuca);
		laMatanza.agregarPersona(laSolange);
		laMatanza.agregarPersona(elDiego);
		laMatanza.agregarPersona(elTomi);
		
		List<Persona> miColeccion = laMatanza.mostrarContenido();
		
		Collections.sort(miColeccion);
		
		
		Integer expected = laMatanza.mostrarContenido().indexOf(elTomi);
		Integer actual = 0;
		
		assertEquals(expected, actual);
		
		
		
	}

}
