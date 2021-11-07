public class Summenfunktion_Hochfunktion{
    public static void main (String[]args){
        
        //Aufruf der Summenfunktion auf beide Arten
        System.out.println(sumIter(100));
        System.out.println(sumRek(100));
        System.out.println(sumEndRek(0,100));

        //Aufruf der Hochfunktion auf beide Arten
        System.out.println(hochIter(3,3));
        System.out.println(hochRek(3,3));
        System.out.println(hochEndRek(1,3, 3));

        
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

    public static int sumEndRek(int res, int num){
        if (num<=0) {
            return res;
        }
        return sumEndRek(res+num, num-1);
    }

    public static int hochIter(int num,int hoch){
        int result=num;
        for(int i=1; i<hoch; i++){
            result*=num;
        }
        return result;
    }

    public static int hochRek(int num, int hoch){
        if (hoch==0){
            return 1;
        }
        return num* hochRek(num,hoch-1);
    }
    
    public static int hochEndRek(int res, int num, int hoch){
        if(hoch==0){
            return res;
        }
        return hochEndRek(res*num,num, hoch-1);
    }
}