package edu.juego;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
public class JuegoSerpientesTest {

    @Test
    public void deberiaGanarJugador1() {
        String input = "Jugador1\nJugador2\n6\n6\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        JuegoSerpientes.main(new String[]{});

        // Se verifica que el resultado sea el esperado, adaptando según tu lógica de juego
        assertEquals("Jugador1 ha ganado.", System.out.toString().trim());
    }

    @Test
    public void deberiaGanarJugador2() {
        String input = "Jugador1\nJugador2\n6\n6\n6\n7\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        JuegoSerpientes.main(new String[]{});

        // Se verifica que el resultado sea el esperado, adaptando según tu lógica de juego
        assertEquals("Jugador2 ha ganado.", System.out.toString().trim());
    }
}