package comparison;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class OperationsMap {

    public void calculateTimeForAddingElements(Map map, String collectionName) {
        Date beforeOperation = new Date();
        for (int i = 0; i < 10000000; i++) {
            map.put(i, i++);
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to fill in the " + collectionName + " with 10.000.000 elements");
    }


    public void calculateTimeForSearch (Map map, String collectionName) {
        Date beforeOperation = new Date();

        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            if (entry.getValue() == 100000) {
                System.out.println("element found");
                break;
            }
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();

        System.out.println("It took " + msDelay + " (in ms) to find the 100000 element in  " + collectionName);
    }


    public void calculateTimeForDeletion (Map map, String collectionName) {
        Date beforeOperation = new Date();
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            entries.remove();
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to delete 10.000.000  element from  " + collectionName);
    }






}
