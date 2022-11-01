package ProblemSolvingBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnexpectedDemand {
    public static void main(String[] args) {
        System.out.println("Unexpected Demand!");

        List<Integer> orders = Arrays.asList(5, 2, 4);

        Collections.sort(orders);

        int widgets = 3;
        int counter = 0;

        for (Integer order : orders) {
            if (order <= widgets) {
                widgets -= order;
                counter++;
            } else {
                break;
            }
        }

        System.out.println("Successful Filled Orders   --->   " + counter);
    }
}
