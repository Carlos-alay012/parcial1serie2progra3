package edu.segundopunto;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.List;

public class PosicionesAdyacentesTest {

    @Test
    public void deberiaObtenerPosicionesAdyacentes() {
        int filas = 3;
        int columnas = 3;
        PosicionesAdyacentes posicionesAdyacentes = new PosicionesAdyacentes(filas, columnas);

        List<int[]> adyacentes = posicionesAdyacentes.obtenerPosicionesAdyacentes(1, 1);

        int[][] esperado = {
                {0, 1},
                {1, 0},
                {1, 2},
                {2, 1}
        };

        assertArrayEquals(esperado, adyacentes.toArray());
    }
}