import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntro1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("William");
        list.add("John");
        list.add("Amanda");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()){
            Object element = listIterator.next();
            System.out.println(element);
        }
        list.clear();
        System.out.println();
    }
}
