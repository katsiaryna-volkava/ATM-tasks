package comparison;

import java.util.Date;
import java.util.List;

public class OperationsList {

    public void calculateTimeForAddingElements(List list, String collectionName) {
        Date beforeOperation = new Date();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to fill in the " + collectionName + " with 10.000.000 elements");
    }

    public void calculateTimeForSearch (List list, String collectionName) {

        Date beforeOperation = new Date();
        list.get(1000000);
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();

        System.out.println("It took " + msDelay + " (in ms) to find the 1000000th element in  " + collectionName);
    }

    public void calculateTimeForDeletion (List list, String collectionName) {
        Date beforeOperation = new Date();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        Date afterOperation = new Date();
        long msDelay = afterOperation.getTime() - beforeOperation.getTime();
        System.out.println("It took " + msDelay + " (in ms) to delete 1000000 element from  " + collectionName);
    }





}
