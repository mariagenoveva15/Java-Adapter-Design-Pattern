public class StackAdapter implements _StackInterface{

    private OldList object;

    StackAdapter(OldList object){

        this.object=object;

    }

    @Override
    public void push(int element){

        this.object.addElement(element);

    }

    @Override
    public void afisare() {
        this.object.afisare();
    }

    @Override
    public int pop() throws  IllegalStateException{

        return this.object.removeLastElement();

    }

    @Override
    public boolean isEmpty() {

       return this.object.isEmpty();

    }

    @Override
    public void cautareElement(int element) {
        this.object.searchElem(element);
    }
}
