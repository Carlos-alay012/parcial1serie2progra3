package edu.juego;

public class Tablero {
    private final int[] origenCasillasEspeciales;
    private final int[] destinoCasillasEspeciales;

    // Constructor que toma los arrays origenCasillasEspeciales y destinoCasillasEspeciales
    public Tablero(int[] origenCasillasEspeciales, int[] destinoCasillasEspeciales) {
        this.origenCasillasEspeciales = origenCasillasEspeciales;
        this.destinoCasillasEspeciales = destinoCasillasEspeciales;
    }

    // Método para obtener la nueva posición en el tablero después de tirar el dado
    public int obtenerNuevaPosicion(int posicionActual, int dado) {
        int nuevaPosicion = posicionActual + dado;

        // Esto verifica si el jugador cae en una casilla especial
        for (int i = 0; i < origenCasillasEspeciales.length; i++) {
            if (posicionActual == origenCasillasEspeciales[i]) {
                System.out.println("¡Caíste en una casilla especial!");
                nuevaPosicion = destinoCasillasEspeciales[i];
                break;
            }
        }

        return nuevaPosicion;
    }
}