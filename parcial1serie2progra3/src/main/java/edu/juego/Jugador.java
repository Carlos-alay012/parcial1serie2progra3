package edu.juego;

import java.util.Random;
import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int posicion;
    private int consecutivosSeis;

    //Información del jugador
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
        this.consecutivosSeis = 0;
    }
    //Este método determina la posición del jugador luego de haber tirado el dado
    public void jugarTurno(Tablero tablero) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(nombre + ", presiona Enter para tirar el dado.");
        scanner.nextLine();

        int dado = random.nextInt(6) + 1;
        System.out.println(nombre + " tiraste un " + dado);

        if (dado == 6) {
            consecutivosSeis++;
            if (consecutivosSeis == 3) {
                System.out.println("Obtuviste tres 6 consecutivos. Vuelves a la posición 1 y quedas bloqueado.");
                posicion = 0;
                consecutivosSeis = 0;
                return;
            }
        } else {
            consecutivosSeis = 0;
        }

        posicion = tablero.obtenerNuevaPosicion(posicion, dado);
        System.out.println(nombre + ", estás en la posición " + posicion);
    }

    public boolean haGanado() {
        //Esto determina la última posición del tablero
        return posicion == 63;
    }

    public String getNombre() {
        return nombre;
    }
}
