import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList();

        myList.add(123);
        myList.add(4);
        myList.add(18);
        myList.add(0);
        System.out.println("rozmiar listy " + myList.size());


        List<Integer> myList2 = new ArrayList();
        for (int i = 0; 1 < 1000; i++) {


            myList2.add(i * i);

            System.out.println("rozmiar listy " + myList2.size());

        }
    }
}



        /*System.out.println("rozmiar listy " + myList.size());
        System.out.println(myList.get(0));
        System.out.println(myList.remove(0));
        System.out.println(myList.get(0));
        System.out.println("rozmiar listy " + myList.size());

        myList.clear();
        System.out.println("rozmiar listy " + myList.size());
        System.out.println(myList.get(2));*/

       /* for (int i = 0; i < myList.size(); i++) {
            System.out.println("Liczba: " + myList.get(0));

        }

        for (Integer i : myList) {
            System.out.println("Liczba: " + i);
        }

        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() == 18) {
                iterator.remove();
            }
            System.out.println("Liczba " + iterator.next());

            for (Integer i : myList) {
                System.out.println("Liczba: " + i);

            }
        }

        ListIterator<Integer> listIterator = myList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println("Liczba: " + listIterator.next());

        }
        while(listIterator.hasPrevious()){
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println("Liczba " + value + " ma index " + index);

        }
*/


        /*ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(new Object());
        arrayList.add("siedem");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println((int)arrayList.get(0) + (String)arrayList.get(2));
*/
 /*       Object[] arr1 = myList.toArray();
        *//*Integer[] arr2 = new Integer[myList.size()];
        arr2 = myList.toArray(arr2);*//*

        Integer[] arr2 = myList.toArray(new Integer[myList.size()]);


        for(Integer i : arr2) {
            System.out.println(i);
        }
    }


}*/