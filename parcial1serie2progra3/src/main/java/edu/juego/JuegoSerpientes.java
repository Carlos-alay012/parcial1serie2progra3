package edu.juego;
import java.util.Scanner;

public class JuegoSerpientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de Serpientes y Escaleras");

        System.out.print("Nombre del Jugador 1: ");
        Jugador jugador1 = new Jugador(scanner.nextLine());

        System.out.print("Nombre del Jugador 2: ");
        Jugador jugador2 = new Jugador(scanner.nextLine());

        int[] origenCasillasEspeciales = {7, 11, 31, 30, 40, 43, 50, 59};
        int[] destinoCasillasEspeciales = {38, 37, 46, 2, 21, 60, 5, 42};

        Tablero tablero = new Tablero(origenCasillasEspeciales, destinoCasillasEspeciales);

        while (true) {
            jugarTurno(jugador1, tablero);
            if (jugador1.haGanado()) {
                System.out.println(jugador1.getNombre() + " ha ganado.");
                break;
            }

            jugarTurno(jugador2, tablero);
            if (jugador2.haGanado()) {
                System.out.println(jugador2.getNombre() + " ha ganado.");
                break;
            }
        }
        scanner.close();
    }
    private static void jugarTurno(Jugador jugador, Tablero tablero) {
        System.out.println("\nTurno de " + jugador.getNombre());
        jugador.jugarTurno(tablero);
    }
}