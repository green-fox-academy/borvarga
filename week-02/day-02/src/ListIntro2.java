import java.util.ArrayList;

public class ListIntro2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        System.out.println(listA);
        ArrayList<String> listB = listA;
        System.out.println(listB);
        listB.remove("Durian");
        System.out.println(listB);
        listA.add(3, "Kiwifruit");
        System.out.println(listA);
    }
}
