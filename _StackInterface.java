// Stack Interface
public interface _StackInterface {

    void push(int element);
    void afisare();
    int pop () throws IllegalStateException;
    boolean isEmpty();
    void cautareElement(int element);
}
