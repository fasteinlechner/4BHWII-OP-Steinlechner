import java.util.Random;

public class BubbleSort{

    public static void main(String[]args){
            int[] unsorted = generateArray(1000);
            System.out.println("Unsortiert:");
            for(Integer item : unsorted){
                System.out.print(item+", ");
            }
            long t1 = System.nanoTime();
            int[] sorted = bubbleSort(unsorted);
            long t2 = System.nanoTime();
            System.out.println();
            System.out.println("=====================================");
            System.out.println("Sortiert:");
            for (int item : sorted) {
                System.out.print(item+", " );
            }
            System.out.println();
            System.out.println("Time-Result:");
            System.out.println("Your time was " + ((t2-t1)/1000)+" mikro s");
            
           
            
    }

    public static int[] bubbleSort(int[] unsorted){
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
