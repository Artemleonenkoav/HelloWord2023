package task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Banan");
        arrayList.add("Lime");
        arrayList.add("Pepsi");
        arrayList.add("Cola");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(arrayList);
//        for (int i = 0; i < 20 ; i++){
//            arrayList.add(i);
//    }
    }
}
