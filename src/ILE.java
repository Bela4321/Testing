public class ILE {
    private int value;
    private ILE next;

    public int getvalue() {
        return this.value;
    }
    public ILE getNext() {
        return this.next;
    }



    public ILE(int value, ILE next) {
        this.value= value;
        this.next= next;
    }
    public ILE(int value){
    this.value=value;}
}