//Maximilian Hofer, 26.11.2024
package A01_Stack;

public class Stack<T>
{
    private Node<T> first;
    private int counter;
    /**
     * Oberstes Element entfernen und zurückliefern.
     * Existiert kein Element, wird eine Exception ausgelöst.
     * @throws StackEmptyException
     */
    public T pop() throws StackEmptyException {
        if(counter == 0)
            throw new StackEmptyException();
        T data = first.getData();
        first = first.getNext();
        counter--;
        return data;
    }
    /**
     * Übergebenen T auf Stack (als oberstes Element) speichern.
     * @param i data
     */
    public void push(T i) {
        Node<T> newNode = new Node<T>(i);
        newNode.setNext(first);
        first = newNode;
        counter++;
    }
    /**
     * Liefert die Anzahl der Elemente im Stack
     * @return
     */
    public int getCount() {
        return counter;
    }
}