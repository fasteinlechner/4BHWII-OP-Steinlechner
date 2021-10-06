
public class Algorithm {
	static int[] array = getArray(1000);
	static int zaehler1;
	static int zaehler2;
	static int mid;
	
	public static void main(String[]args) {
		iterativ(856, array);
		System.out.println(zaehler1);
		binaer(856, array);
		System.out.println(zaehler2);
	}
	
	
	
	public static boolean iterativ(int x, int[]arr) {
			for (int i = 0; i < array.length; i++) {
				zaehler1++;
				if(arr[i]==x) {
					return true;
				}
			}
		return false;
	}
	
	public static boolean binaer(int x, int[] arr) {
		int beg=0;
		int end= arr.length-1;
		
		while (beg<=end) {
			mid=(beg+end)/2;
			zaehler2++;
			if(arr[mid]<x) {
				beg=mid+1;
			}else if (arr[mid]>x) {
				end=mid-1;
			}
			else {
				return true;
			}
		}
		return false;
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
