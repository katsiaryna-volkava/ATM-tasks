package comparation;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class OperationSet {

    public void calculateTimeForAddingElements(Set set, String collectionName) {
        Date beforeOperation = new Date();
        for (int i = 0; i < 10000000; i++) {
            set.add(i);
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to fill in the " + collectionName + " with 10.000.000 elements");
    }

    public void calculateTimeForSearch (Set set, String collectionName) {

        Date beforeOperation = new Date();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 100000) {
                System.out.println("element found");
                break;
            }
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();

        System.out.println("It took " + msDelay + " (in ms) to find the 100000 element in  " + collectionName);
    }

    public void calculateTimeForDeletion (Set set, String collectionName) {
        Date beforeOperation = new Date();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            iterator.remove();
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to delete 10.000.000  element from  " + collectionName);
    }





}
