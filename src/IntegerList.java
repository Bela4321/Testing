public class IntegerList {
    private ILE head;

    public IntegerList(ILE head) {
        this.head = head;
    }

    public boolean isEmpty() {
        return (this.head==null);
    }

    public void prepend(int value) {
        ILE newElement = new ILE(value, this.head);
        this.head = newElement;
    }
    public int indexOf(int value) {
        int depth = 0;
        ILE current = head;
        while (current != null) {
            if (current.getvalue()==value) {
                return depth;
            }
            depth++;
            current = current.getNext();
        }
        return -1;
    }
}