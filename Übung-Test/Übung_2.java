public class Übung_2{
    public static void main (String[]args){
        char[] arr= new char[]{'c','b','a'};
        System.out.println("Unsortiert:");
        for (char a : arr){
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("Sortiert-Bubblesort");
        char[] sortedArr= bubbleSortFast(arr);
        for(char a : sortedArr){
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("Sortiert-Selectionsort");
        char[] sortedArr1= selectionSort(arr);
        for(char a : sortedArr1){
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("Sortiert-Insertionsort");
        char[] sortedArr2= insertionSort(arr);
        for(char a : sortedArr2){
            System.out.print(a+", ");
        }


    }
    public static char[] bubbleSortFast(char[] unsorted){
        char temp;
        boolean noSwap;
        for(int i=0; i<unsorted.length; i++){
            noSwap=true;
            for(int j=0; j<unsorted.length-i-1; j++){
                if( (int)unsorted[j]>  (int)unsorted[j+1]){     //auch ohne cast möglich weil char schon als int verglichen wird
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


    public static char[] selectionSort(char[] unsorted){
        for(int i=0; i<unsorted.length; i++){
            int min= i;
            for(int j=i+1; j<unsorted.length; j++){
                if((int)unsorted[j]< (int)unsorted[i]){
                    min=j;
                }
            }
            if(min!=i){
                char temp=unsorted[i];
                unsorted[i]=unsorted[min];
                unsorted[min]=temp;
            }
        }
        return unsorted;
    }

    public static char[] insertionSort(char[] unsorted){
        for(int i=0; i<unsorted.length; i++){
            char temp = unsorted[i];
            int j = i;
            while(j>0&&unsorted[j-1]>temp){
                unsorted[j]=unsorted[j-1];
                j--;
            }
            unsorted[j]=temp;
        }
        return unsorted;
    }
}