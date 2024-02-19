package git;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String [ ]jugadores;
	public Equipo() {
		super();
	}
	
	public Equipo(String nombre, String[] jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + Arrays.toString(jugadores) + "]";
	}
	//??
	public void mostrarJugadores() {
        System.out.println("Jugadores del equipo " + nombre + ":");
        for (String jugador : jugadores) {
            System.out.println(jugador);
        }
    }
}
