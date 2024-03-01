package edu.segundopunto;

import java.util.ArrayList;
import java.util.List;
public class PosicionesAdyacentes {
    private final int filas;
    private final int columnas;

    public PosicionesAdyacentes(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public List<int[]> obtenerPosicionesAdyacentes(int fila, int columna) {
        List<int[]> posicionesAdyacentes = new ArrayList<>();

        // Verificar arriba
        if (fila - 1 >= 0) {
            posicionesAdyacentes.add(new int[]{fila - 1, columna});
        }

        // Verificar abajo
        if (fila + 1 < filas) {
            posicionesAdyacentes.add(new int[]{fila + 1, columna});
        }

        // Verificar izquierda
        if (columna - 1 >= 0) {
            posicionesAdyacentes.add(new int[]{fila, columna - 1});
        }

        // Verificar derecha
        if (columna + 1 < columnas) {
            posicionesAdyacentes.add(new int[]{fila, columna + 1});
        }

        return posicionesAdyacentes;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int filas = 3;
        int columnas = 3;

        PosicionesAdyacentes posicionesAdyacentes = new PosicionesAdyacentes(filas, columnas);
        List<int[]> adyacentes = posicionesAdyacentes.obtenerPosicionesAdyacentes(1, 1);

        System.out.println("Posiciones adyacentes a (1,1):");
        for (int[] posicion : adyacentes) {
            System.out.println("(" + posicion[0] + ", " + posicion[1] + ")");
        }
    }
}