package Medium.Greedy;

import java.util.ArrayList;

public class PetrolDistance {
    /*
     * Question
     * You have been given a circular path. There are 'N' petrol pumps on this path
     * that are numbered from 0 to N - 1 (Both inclusive). Each petrol pump has two
     * values associated with it:
     * 
     * 1)The amount of petrol that is available at this particular petrol pump.
     * 2)The distance to reach the next petrol pump.
     * You are on a truck having an empty tank of infinite capacity. You can start
     * the tour from any of the petrol pumps. Your task is to calculate the first
     * petrol pump from where the truck will be able to complete the full circle or
     * determine if it is impossible to do so.
     * 
     * You may assume that the truck will stop at every petrol pump and it will add
     * the petrol from that pump to its tank. The truck will move one kilometre for
     * each litre of petrol consumed.
     * I thiugh could be solved using comparable but this method is more easy and
     * efficient.
     * Asked in Amazon, Apple Accenture, Atlassian, flipkart, infosys, TCS
     */
    public static int firstCircularTour(ArrayList<Integer> petrol, ArrayList<Integer> distance, int n){
        long totalPetrol = 0;
        long totalDistance = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += petrol.get(i);
            totalDistance += distance.get(i);
        }

        if(totalPetrol < totalDistance) return -1;

        long currentPetrol = 0;
        long startDistance = 0;

        for (int i = 0; i < n; i++) {
            currentPetrol += petrol.get(i) - distance.get(i);

            if(currentPetrol < 0) {
                currentPetrol = 0;
                startDistance = i +1;
            }
        }
        return (int)startDistance;
    }    
}
