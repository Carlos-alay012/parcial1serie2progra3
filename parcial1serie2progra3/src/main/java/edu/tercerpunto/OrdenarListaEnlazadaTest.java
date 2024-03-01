package edu.tercerpunto;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class OrdenarListaEnlazadaTest {

    @Test
    public void deberiaOrdenarLista() {
        // Prueba 1
        ListNode cabeza1 = new ListNode(4);
        cabeza1.next = new ListNode(2);
        cabeza1.next.next = new ListNode(1);
        cabeza1.next.next.next = new ListNode(3);

        ListNode resultado1 = OrdenarListaEnlazada.ordenarLista(cabeza1);

        int[] esperado1 = {1, 2, 3, 4};
        assertArrayEquals(esperado1, obtenerArrayDesdeLista(resultado1));

        // Prueba 2
        ListNode cabeza2 = new ListNode(-1);
        cabeza2.next = new ListNode(5);
        cabeza2.next.next = new ListNode(3);
        cabeza2.next.next.next = new ListNode(4);
        cabeza2.next.next.next.next = new ListNode(0);

        ListNode resultado2 = OrdenarListaEnlazada.ordenarLista(cabeza2);

        int[] esperado2 = {-1, 0, 3, 4, 5};
        assertArrayEquals(esperado2, obtenerArrayDesdeLista(resultado2));

        // Prueba 3
        ListNode cabeza3 = null;

        ListNode resultado3 = OrdenarListaEnlazada.ordenarLista(cabeza3);

        // La lista vacía debería permanecer igual
        assertArrayEquals(null, obtenerArrayDesdeLista(resultado3));
    }
    private int[] obtenerArrayDesdeLista(ListNode head) {
        if (head == null) {
            return null;
        }

        int longitud = obtenerLongitudLista(head);
        int[] array = new int[longitud];
        int indice = 0;

        while (head != null) {
            array[indice] = head.val;
            head = head.next;
            indice++;
        }

        return array;
    }

    private int obtenerLongitudLista(ListNode head) {
        int longitud = 0;
        while (head != null) {
            longitud++;
            head = head.next;
        }
        return longitud;
    }
}