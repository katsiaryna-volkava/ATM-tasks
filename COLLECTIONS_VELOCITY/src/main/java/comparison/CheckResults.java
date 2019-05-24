package comparison;

import java.util.*;

public class CheckResults {

    public static void main(String[] args) {


        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();


        OperationsList lists = new OperationsList();
        OperationSet sets = new OperationSet();
        OperationsMap maps = new OperationsMap();

        // array list vs. linked list
        System.out.println("ARRAY LIST VS. LINKED LIST");
        System.out.println();
        lists.calculateTimeForAddingElements(arrayList, "array list");
        lists.calculateTimeForAddingElements(linkedList, "linked list");
        lists.calculateTimeForSearch(arrayList, "array list");
        lists.calculateTimeForSearch(linkedList, "linked list");
        lists.calculateTimeForDeletion(arrayList, "array list");
        lists.calculateTimeForDeletion(linkedList, "linked list");
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println();
        System.out.println();

        // hash set vs. tree set
        System.out.println("HASH SET VS. TREE SET");
        System.out.println();
        System.out.println();

        sets.calculateTimeForAddingElements(hashSet, "hash set");
        sets.calculateTimeForAddingElements(treeSet, "tree set");
        sets.calculateTimeForSearch(hashSet, "hash set");
        sets.calculateTimeForSearch(treeSet, "tree set");
        sets.calculateTimeForDeletion(hashSet, "hash set");
        sets.calculateTimeForDeletion(treeSet, "tree set");
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println();
        System.out.println();


        // hash map vs. tree map
        System.out.println("HASH MAP VS. TREE MAP");
        System.out.println();
        maps.calculateTimeForAddingElements(hashMap, "hash map");
        maps.calculateTimeForAddingElements(treeMap, "tree map");
        maps.calculateTimeForSearch(hashMap, "hash map");
        maps.calculateTimeForSearch(treeMap, "tree map");
        maps.calculateTimeForDeletion(hashMap, "hash map");
        maps.calculateTimeForDeletion(treeMap, "tree map");
    }
}
