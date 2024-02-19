package git;

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
}
