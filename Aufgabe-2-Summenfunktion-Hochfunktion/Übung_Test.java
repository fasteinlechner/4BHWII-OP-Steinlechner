public class Übung_Test {
    static int [] array = getArray(3000);
	
	public static void main(String[]args) {
        /* System.out.println(iterativeSearch(4000, array));
         System.out.println(binarySearch(4000, array));
         System.out.println(binarySearchRek(4000, array,0,array.length));*/

         System.out.println(sumIter(100));
         System.out.println(sumRek(100));
         System.out.println(hochIter(3,3));
         System.out.println(hochRek(3,3));
         System.out.println(sumEndRek(0,100));
         System.out.println(hochEndRek(1,3,3));
	}
	
	public static boolean iterativeSearch(int num, int []arr){
        for(int i=0; i < array.length; i++){
            if(arr[i]==num){
                return true;
            }
        }

        return false;
    }

    public static boolean binarySearch(int num, int[]arr){
        int begin= 0;
        int end= arr.length;

        while(begin<end){
            int mid = (begin+end)/2;
            if(num==arr[mid]){
                return true;
            } 
            if(num<arr[mid]){
                end=mid-1;
            }
            if(num>arr[mid]){
                begin=mid+1;
            }
        }
        return false;
    }

    public static boolean binarySearchRek(int num, int[] arr, int begin, int end){
            int mid = (begin+end)/2;

            if(begin<end){
                if(num==arr[mid]){
                    return true;
                } 
                if(num<arr[mid]){
                    return binarySearchRek(num, arr, begin, mid-1);
                }
                if(num>arr[mid]){
                    return binarySearchRek(num, arr, mid+1, end);
                }
            }
            return false;
    }


    public static int sumIter(int num){
        int res=0;
        for(int i =0; i<=num; i++){
            res+=i;
        }
        return res;
    }

    public static int hochIter(int num, int expo){
        int res= 1;
        for(int i=0; i<expo; i++){
            res*=num;
        }

        return res;
    }

    public static int sumRek(int num){
        if(num==0){
            return 0;
        }
        return num + sumRek(num-1);
    }

    public static int hochRek(int num, int expo){
        if(expo==0){
            return 1;
        }
        return num * hochRek(num, expo-1);
    }

    public static int sumEndRek(int res, int num){
        if(num==0){                             
            return res;
        }
        return sumEndRek(res+num, num-1);       
    }

    public static int hochEndRek(int res, int num, int expo){
        if(expo==0){
            return res; 
        }
        return hochEndRek(res*num, num, expo-1);
    }

    public static int[] getArray(int anz) {
		int[] arr = new int[anz];
		int zahl = 0;
	
		for(int i =0; i< arr.length; i++) {
			arr[i]=zahl;
			zahl++;
		}
		return arr;
	}



}
