import java.util.*;

public class Übung_1 {
    
    public static void main (String args[]){
        int [] unsortiert = generateArray(10000);
        System.out.println("Unsortierte Liste: ");
        for(Integer i : unsortiert){
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Sortierte Liste - langsam: ");
        long t1 = System.nanoTime();
        int [] sortiert1 = bubbleSortSlow(unsortiert);
        long t2 = System.nanoTime();
        for (Integer i : sortiert1) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Sortierte Liste - schnell: ");
        long t3 = System.nanoTime();
        int [] sortiert2 = bubbleSortSlow(unsortiert);
        long t4 = System.nanoTime();
        for (Integer i : sortiert2) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Sortierte Liste - Selection: ");
        long t5 = System.nanoTime();
        int [] sortiert3 = selectionSort(unsortiert);
        long t6 = System.nanoTime();
        for (Integer i : sortiert3) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Sortierte Liste - Insertion: ");
        long t7 = System.nanoTime();
        int [] sortiert4 = insertionSort(unsortiert);
        long t8 = System.nanoTime();
        for (Integer i : sortiert4) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("Zeit für Slow: "+ (t2-t1));
        System.out.println("Zeit für Fast: "+ (t4-t3));
        System.out.println("Zeit für Selection: "+ (t6-t5));
        System.out.println("Zeit für Insertion: "+ (t8-t7));

    }
    public static int[] bubbleSortSlow(int[] unsorted){
        int temp;
        for(int i = 1; i<unsorted.length; i++){
            for(int j=0; j<unsorted.length-i; j++){
                if(unsorted[j]> unsorted[j+1]){
                    temp=unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    unsorted[j+1]=temp;
                }
            }
        }

        return unsorted;
    }
    public static int[] bubbleSortFast(int[] unsorted){
        int temp;
        boolean noSwap;
        for(int i=1; i<unsorted.length; i++){
            noSwap=true;
            for(int j=0; j<unsorted.length-i; j++){
                if(unsorted[j]> unsorted[j+1]){
                    temp= unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    unsorted[j+1]=temp;
                    noSwap=false;
                }
                
            }
            // Optimierung: wenn also nichts mehr zum Austauschen ist,
            // dann wird der Vorgang abgebrochen ==> Liste ist schon sortiert
            if(noSwap){
                break;
            }
        }
        return unsorted;
    }
    public static int[] selectionSort(int[] unsorted){
        for (int i =1; i< unsorted.length; i++){
            int temp;
            for(int j=i+1; j< unsorted.length; j++){
                if(unsorted[j]<unsorted[i]){
                    temp= unsorted[i];
                    unsorted[i]= unsorted[j];
                    unsorted[j]= temp;
                }
            }
        }
        return unsorted;
    }
    public static int[] insertionSort(int[] unsorted){
        for (int i =1; i<unsorted.length; i++){
            int temp= unsorted[i];
            int j = i;
            while(j>0 && unsorted[j-1]>temp){
                unsorted[j] = unsorted[j-1];
                j--;
            }
            unsorted[j]=temp;
        }
        return unsorted;
    }
    public static int[] generateArray(int anz){
        int[] arr = new int[anz];
        Random rand = new Random();
        for(int i =0; i< arr.length; i++) {
            int rnd = rand.nextInt(anz-1);
            arr[i]=rnd;
        }
        return arr;
}


}
