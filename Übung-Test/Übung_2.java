public class Übung_2{
    public static void main (String[]args){
        char[] arr= new char[]{'c','b','a'};
        System.out.println("Unsortiert:");
        for (char a : arr){
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("Sortiert");
        char[] sortedArr= bubbleSortFast(arr);
        for(char a : sortedArr){
            System.out.print(a+", ");
        }


    }
    public static char[] bubbleSortFast(char[] unsorted){
        char temp;
        boolean noSwap;
        for(int i=1; i<unsorted.length; i++){
            noSwap=true;
            for(int j=0; j<unsorted.length-i; j++){
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
}