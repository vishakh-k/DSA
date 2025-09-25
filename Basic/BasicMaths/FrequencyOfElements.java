package BasicMaths;

import java.util.*;
public class FrequencyOfElements {

    // Pair class to hold element and frequency
    static class Pair {
        int element;
        int frequency;

        Pair(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }

    /**
     * Counts the frequency of each element in the array, preserving insertion order.
     */
    public List<Pair> countFreq(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Pair> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        FrequencyOfElements sol = new FrequencyOfElements();
        List<Pair> freqList = sol.countFreq(arr);

         System.out.println("Element  Frequency");
        for (Pair p : freqList) {
            System.out.println(p.element + "         " + p.frequency);
        }
    }
}