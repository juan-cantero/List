import java.util.Iterator;
import java.util.ListIterator;

public class Main {

  public static void main(String[] args) {
    IntegerLinkList list = new IntegerLinkList();

    list.addToFront(4);
    list.addToFront(3);
    list.addToFront(2);
    list.addToFront(1);
    list.addToFront(0);


    Iterator l = list.iterator();

    while (l.hasNext()) {
      System.out.println(l.next());
    }






  }
}