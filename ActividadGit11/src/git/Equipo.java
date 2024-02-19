package git;

import java.util.Arrays;

public class Equipo {
	String nombre;
	String [ ]jugadores;
	
	public boolean existeJugador(String jugador) {
		for (String j : jugadores) {
			if (j.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	public int cantidadDeJugadores() {
		int contadorJugadores = 0;
		for(String j : jugadores) {
			if(j != null) {
				contadorJugadores++;
			}
		}
		return contadorJugadores;
	}

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
        public boolean listasIguales (Equipo segundoEquipo) {
    		if (this.jugadores.length != segundoEquipo.jugadores.length) {
    			return false;
    		}
    		
    		for(String otroJugador : segundoEquipo.jugadores) {
    			if(existeJugador(otroJugador)) {
    				continue;
    			}else {
    				return false;
    			}
    		}
    		
    		return true;

    }

}
