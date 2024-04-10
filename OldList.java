import java.util.ArrayList;
import java.util.List;

public class OldList{

    private List<Integer> list; // a list formed of integers only

    OldList(){

        this.list=new ArrayList<Integer>();

    }

    public void addElement(int element) {

            list.add(element);
            System.out.println("Added element: " + element);

    }

    public int removeLastElement() throws IllegalStateException{

       if(!this.list.isEmpty()){
           int _AdiosElement=this.list.remove(this.list.size()-1);
           System.out.println("Element scos: "+_AdiosElement);
           return _AdiosElement;
       }
       else {
           throw new IllegalStateException("Lista este goala. Nu se poate scoate elementul.");
           // IllegalStateException = Signals that a method has been invoked at an illegal or inappropriate
                                    // time. In other words, the Java environment or Java application is
                                    // not in an appropriate state for the requested operation.
       }

    }

    public boolean isEmpty() {

        return this.list.isEmpty();

    }

    public void afisare(){

        System.out.println(list);
    }

    public void searchElem(int element){

        if(this.list.contains(element)){ //contains returneaza true sau false
            System.out.println("Elementul "+element + " a fost gasit."+" Valoarea implicita returnata: "+this.list.contains(element));
        }

        else {
            System.out.println("Elementul "+element+ " nu a fost gasit."+ "Valoare implicita returnata: "+ this.list.contains(element));
        }

    }
}
