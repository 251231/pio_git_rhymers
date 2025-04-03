package edu.kis.vh.nursery.list;

/**
 * Node jest to klasa reprezentująca pojedynczy węzeł w liście dwukierunkowej
 * Każdy węzeł przechowuje wartość całkowitą oraz wskaźniki na poprzedni i następny węzeł
 */
public class Node {

    /**
     * Wartość którą przechowujemy w węźle
     */
    private final int value;

    /**
     * Wskaźnik wskazujący na poprzedni węzeł
     */
    private Node prev;

    /**
     * Wskaźnik wskazujący na następny węzeł
     */
    private Node next;

    /**
     * Jest to konstruktor inicjalizujący węzeł przyjmujący parametr i,
     * który jest jest ustawiany jako wartość w tym węźle
     * * @param i
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Getter zwracający wartość przechowywaną w węźle
     * @return value
     */
    public int getValue() {
        return value;
    }

    /**
     * Getter zwracający wskaźnik na poprzedni węzeł
     * @return prev
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Setter pozwalający ustawić poprzedni węzeł
     * * @param prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Getter zwracający wskaźnik na następny węzeł
     * @return next
     */
    public Node getNext() {
        return next;
    }

    /**
     * Setter pozwalający ustawić następny węzeł
     * * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
