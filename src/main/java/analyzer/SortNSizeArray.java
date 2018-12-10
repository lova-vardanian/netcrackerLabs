package analyzer;

import fillers.Fillers;
import sorts.bubblesort.BubbleSort;
import sorts.myarrays.MyArrays;
import sorts.qsort.Qsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortNSizeArray {

    private Map<String,Map> generalTimesMap = new HashMap<>();

    private Map<String, ArrayList> randArrayMap = new HashMap<>();
    private Map<String, ArrayList> reversArrayMap = new HashMap<>();
    private Map<String, ArrayList> randLastElementMap = new HashMap<>();
    private Map<String, ArrayList> sortedMap = new HashMap<>();

    //int maxArrSize = 1_000_000;

    public Map<String, Map> getGeneralTimesMap() {
        return generalTimesMap;
    }

    protected Map<String, ArrayList> getRandArrayMap() {
        return randArrayMap;
    }

    protected Map<String, ArrayList> getReversArrayMap() {
        return reversArrayMap;
    }

    protected Map<String, ArrayList> randLastElementMap() {
        return randLastElementMap;
    }

    protected Map<String, ArrayList> sortedMap() {
        return sortedMap;
    }

    public void sortRandArray(int maxArrSize) {

        if (maxArrSize > 1) {

            ArrayList<Long> nBubbleSortTime = new ArrayList<>();
            ArrayList<Long> nMyArraysTime = new ArrayList<>();
            ArrayList<Long> nQsortTime = new ArrayList<>();
            ArrayList<Long> nReverseBubbleSortTime = new ArrayList<>();

            int[] fillers;

            for (int i = 1; i < maxArrSize; i = i * 10) {

                fillers = Fillers.randArray(i);

                nBubbleSort(fillers, nBubbleSortTime);
                randArrayMap.put("nBubbleSort", nBubbleSortTime);

                nMyArrays(fillers, nMyArraysTime);
                randArrayMap.put("nMyArrays", nMyArraysTime);

                try {
                    nQsort(fillers, nQsortTime);
                    randArrayMap.put("nQsort", nQsortTime);
                } catch (StackOverflowError stackOverflowError) {
                    System.out.println("StackOverflowError \n\t for nQsort package analyzer class SortNLensArray");
                }

                nReverseBubbleSort(fillers, nReverseBubbleSortTime);
                randArrayMap.put("nReverseBubbleSort", nReverseBubbleSortTime);

            }

            generalTimesMap.put("randArrayMap", randArrayMap);

//        if (!(randArrayMap.isEmpty())) {
//            System.out.println("This is randArrayMap");
//            System.out.println("nBubbleSortTime" + randArrayMap.get("nBubbleSort"));
//            System.out.println("nMyArraysTime" + randArrayMap.get("nMyArrays"));
//            System.out.println("nQsortTime" + randArrayMap.get("nQsort"));
//            System.out.println("nReverseBubbleSortTime" + randArrayMap.get("nReverseBubbleSort"));
//        }

//        if (!(generalTimesMap.isEmpty())) {
//            System.out.println("generalTimesMap" + generalTimesMap.get("randArrayMap"));
//        }
        }else {
            System.out.println("maxArrSize should be great than 1");
        }
    }

    public void sortReversArray(int maxArrSize) {

        if (maxArrSize > 1) {
            ArrayList<Long> nBubbleSortTime = new ArrayList<>();
            ArrayList<Long> nMyArraysTime = new ArrayList<>();
            ArrayList<Long> nQsortTime = new ArrayList<>();
            ArrayList<Long> nReverseBubbleSortTime = new ArrayList<>();

            int[] fillers;

            for (int i = 1; i < maxArrSize; i = i * 10) {

                fillers = Fillers.reverseSort(i);

                nBubbleSort(fillers, nBubbleSortTime);
                reversArrayMap.put("nBubbleSort", nBubbleSortTime);

                nMyArrays(fillers, nMyArraysTime);
                reversArrayMap.put("nMyArrays", nMyArraysTime);

                try {
                    nQsort(fillers, nQsortTime);
                    reversArrayMap.put("nQsort", nQsortTime);
                } catch (StackOverflowError stackOverflowError) {
                    System.out.println("StackOverflowError \n\t for nQsort package analyzer class SortNLensArray");
                }

                nReverseBubbleSort(fillers, nReverseBubbleSortTime);
                reversArrayMap.put("nReverseBubbleSort", nReverseBubbleSortTime);

            }

            generalTimesMap.put("reversArrayMap", reversArrayMap);

//        if (!(reversArrayMap.isEmpty())) {
//            System.out.println("This is reversArrayMap");
//            System.out.println("nBubbleSortTime" + reversArrayMap.get("nBubbleSort"));
//            System.out.println("nMyArraysTime" + reversArrayMap.get("nMyArrays"));
//            System.out.println("nQsortTime" + reversArrayMap.get("nQsort"));
//            System.out.println("nReverseBubbleSortTime" + reversArrayMap.get("nReverseBubbleSort"));
//        }

//        if (!(generalTimesMap.isEmpty())) {
//            System.out.println("generalTimesMap" + generalTimesMap.get("reversArrayMap"));
//        }
        } else {
            System.out.println("maxArrSize should be great than 1");
        }
    }

    public void sortRandLastElementArray(int maxArrSize) {

        if (maxArrSize > 1) {
            ArrayList<Long> nBubbleSortTime = new ArrayList<>();
            ArrayList<Long> nMyArraysTime = new ArrayList<>();
            ArrayList<Long> nQsortTime = new ArrayList<>();
            ArrayList<Long> nReverseBubbleSortTime = new ArrayList<>();

            int[] fillers;

            for (int i = 1; i < maxArrSize; i = i * 10) {

                fillers = Fillers.randLastElement(i);

                nBubbleSort(fillers, nBubbleSortTime);
                randLastElementMap.put("nBubbleSort", nBubbleSortTime);

                nMyArrays(fillers, nMyArraysTime);
                randLastElementMap.put("nMyArrays", nMyArraysTime);

                try {
                    nQsort(fillers, nQsortTime);
                    randLastElementMap.put("nQsort", nQsortTime);
                } catch (StackOverflowError stackOverflowError) {
                    System.out.println("StackOverflowError \n\t for nQsort package analyzer class SortNLensArray");
                }

                nReverseBubbleSort(fillers, nReverseBubbleSortTime);
                randLastElementMap.put("nReverseBubbleSort", nReverseBubbleSortTime);

            }

            generalTimesMap.put("randLastElementMap", randLastElementMap);

//        if (!(randLastElementMap.isEmpty())) {
//            System.out.println("This is randLastElementMap");
//            System.out.println("nBubbleSortTime" + randLastElementMap.get("nBubbleSort"));
//            System.out.println("nMyArraysTime" + randLastElementMap.get("nMyArrays"));
//            System.out.println("nQsortTime" + randLastElementMap.get("nQsort"));
//            System.out.println("nReverseBubbleSortTime" + randLastElementMap.get("nReverseBubbleSort"));
//        }

//        if (!(generalTimesMap.isEmpty())) {
//            System.out.println("generalTimesMap" + generalTimesMap.get("randLastElementMap"));
//        }
        } else {
            System.out.println("maxArrSize should be great than 1");
        }
    }

    public void sortSortedArray(int maxArrSize) {

        if (maxArrSize > 1) {
            ArrayList<Long> nBubbleSortTime = new ArrayList<>();
            ArrayList<Long> nMyArraysTime = new ArrayList<>();
            ArrayList<Long> nQsortTime = new ArrayList<>();
            ArrayList<Long> nReverseBubbleSortTime = new ArrayList<>();

            int[] fillers;

            for (int i = 1; i < maxArrSize; i = i * 10) {

                fillers = Fillers.sort(i);

                nBubbleSort(fillers, nBubbleSortTime);
                sortedMap.put("nBubbleSort", nBubbleSortTime);

                nMyArrays(fillers, nMyArraysTime);
                sortedMap.put("nMyArrays", nMyArraysTime);

                try {
                    nQsort(fillers, nQsortTime);
                    sortedMap.put("nQsort", nQsortTime);
                } catch (StackOverflowError stackOverflowError) {
                    System.out.println("StackOverflowError \n\t for nQsort package analyzer class SortNLensArray");
                }

                nReverseBubbleSort(fillers, nReverseBubbleSortTime);
                sortedMap.put("nReverseBubbleSort", nReverseBubbleSortTime);

            }

            generalTimesMap.put("sortedMap", sortedMap);

//        if (!(sortedMap.isEmpty())) {
//            System.out.println("This is sortedMap");
//            System.out.println("nBubbleSortTime" + sortedMap.get("nBubbleSort"));
//            System.out.println("nMyArraysTime" + sortedMap.get("nMyArrays"));
//            System.out.println("nQsortTime" + sortedMap.get("nQsort"));
//            System.out.println("nReverseBubbleSortTime" + sortedMap.get("nReverseBubbleSort"));
//        }

//        if (!(generalTimesMap.isEmpty())) {
//            System.out.println("generalTimesMap" + generalTimesMap.get("sortedMap"));
//        }
        } else {
            System.out.println("maxArrSize should be great than 1");
        }
    }

    private static ArrayList nBubbleSort(int[] fillers, ArrayList<Long> times) {

        int[] array = fillers;

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        long time = bubbleSort.getTime();
        times.add(time);

        return times;

    }

    private static ArrayList nReverseBubbleSort(int[] fillers, ArrayList<Long> times) {

        int[] array = fillers;

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.reverseSort(array);

        long time = bubbleSort.getTime();
        times.add(time);

        return times;

    }

    private static ArrayList nMyArrays(int[] fillers, ArrayList<Long> times) {

        int[] array = fillers;

        MyArrays myArrays = new MyArrays();
        myArrays.sort(array);

        long time = myArrays.getTime();
        times.add(time);

        return times;

    }

    private static ArrayList nQsort(int[] fillers, ArrayList<Long> times) {

        int[] array = fillers;

        Qsort qsort = new Qsort();
        qsort.sort(array);

        long time = qsort.getTime();
        times.add(time);

        return times;

    }

}
