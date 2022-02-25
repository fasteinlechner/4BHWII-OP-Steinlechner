import java.util.Random;

public class Quicksort{
    
    public static void main (String[] args){
        int[] unsorted = generateArray(10);
        System.out.println("Unsortiert:\n======================");
        for(Integer i : unsorted){
            System.out.print(i+", ");
        }
        System.out.println("\nSortiert:\n====================");
        quickSort(unsorted, 0, unsorted.length-1);
        for(Integer i : unsorted){
            System.out.print(i+", ");
        }
    }



    public static int partition(int[] arr, int low, int high){
        int pivot= arr[high];

        int i = (low-1);
        for (int j = low; j<=high -1 ; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        } 
        int temp= arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return(i+1);
    }

    public static void quickSort(int[]arr, int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
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