package edu.tercerpunto;

public class OrdenarListaEnlazada {
    public static ListNode ordenarLista(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        do {
            swapped = false;
            ListNode prev = null;
            ListNode current = head;
            ListNode next = head.next;

            while (next != null) {
                if (current.val > next.val) {
                    current.next = next.next;
                    next.next = current;

                    if (prev == null) {
                        head = next;
                    } else {
                        prev.next = next;
                    }

                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);

        return head;
    }

    public static void imprimirLista(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Prueba 1
        ListNode cabeza1 = new ListNode(4);
        cabeza1.next = new ListNode(2);
        cabeza1.next.next = new ListNode(1);
        cabeza1.next.next.next = new ListNode(3);

        System.out.println("Entrada 1:");
        imprimirLista(cabeza1);
        ListNode resultado1 = ordenarLista(cabeza1);
        System.out.println("Salida 1:");
        imprimirLista(resultado1);

        // Prueba 2
        ListNode cabeza2 = new ListNode(-1);
        cabeza2.next = new ListNode(5);
        cabeza2.next.next = new ListNode(3);
        cabeza2.next.next.next = new ListNode(4);
        cabeza2.next.next.next.next = new ListNode(0);

        System.out.println("\nEntrada 2:");
        imprimirLista(cabeza2);
        ListNode resultado2 = ordenarLista(cabeza2);
        System.out.println("Salida 2:");
        imprimirLista(resultado2);

        // Prueba 3
        ListNode cabeza3 = null;

        System.out.println("\nEntrada 3:");
        imprimirLista(cabeza3);
        ListNode resultado3 = ordenarLista(cabeza3);
        System.out.println("Salida 3:");
        imprimirLista(resultado3);
    }
}