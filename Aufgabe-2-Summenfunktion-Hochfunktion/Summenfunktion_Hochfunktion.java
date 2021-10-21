public class Summenfunktion_Hochfunktion{
    public static void main (String[]args){
        
        //Aufruf der Summenfunktion auf beide Arten
        System.out.println(sumIter(100));
        System.out.println(sumRek(100));

        //Aufruf der Hochfunktion auf beide Arten
        System.out.println(hochIter(3,3));
        System.out.println(hochRek(3,3));

        
    }

    public static int sumIter(int num){
        int result=0;
        while (num>0){
            result+=num;
            num--;
        }

        return result;
    }

    public static int sumRek(int num){
        if(num <=0){
            return 0;
        }
        return num+sumRek(num-1);
    }

    public static int hochIter(int a,int num){
        int result=a;
        for(int i=1; i<num; i++){
            result*=a;
        }
        return result;
    }

    public static int hochRek(int a, int num){
        if (num==0){
            return 1;
        }
        return a* hochRek(a,num-1);
    }
}