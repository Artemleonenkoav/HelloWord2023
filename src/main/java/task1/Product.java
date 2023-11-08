package task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bananas");
        arrayList.add("Lime");
        arrayList.add("Pepsi");
        arrayList.add("Cola");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Pepsi")) {
                iterator.remove();
            }
            System.out.println(arrayList);
        }
    }
}
