public class Summenfunktion_Hochfunktion{
    public static void main (String[]args){
        //Aufruf der Summenfunktion auf alle Arten
        long startSumIter = System.nanoTime();
        int sumIter= sumIter(100);
        long timeSumIter= System.nanoTime()-startSumIter;

        long startSumRek = System.nanoTime();
        int sumRek= sumRek(100);
        long timeSumRek= System.nanoTime()-startSumRek;

        long startSumEndRek = System.nanoTime();
        long sumEndRek= sumEndRek(0,100);
        long timeSumEndRek= System.nanoTime()-startSumEndRek;
        

        //Aufruf der Hochfunktion auf beide Arten
        long startHochIter = System.nanoTime();
        int hochIter= hochIter(3,3);
        long timeHochIter= System.nanoTime()-startHochIter;

        long startHochRek = System.nanoTime();
        int hochRek= hochRek(3,3);
        long timeHochRek= System.nanoTime()-startHochRek;

        long startHochEndRek = System.nanoTime();
        int hochEndRek= hochEndRek(1,3,3);
        long timeHochEndRek= System.nanoTime()-startHochEndRek;



        System.out.println("Summenfunktionen\n====================");
        System.out.println("Iterative Summenfunktion: \t\tErgebnis: "+sumIter+"\t\tDauer: "+timeSumIter+" nanosecond\n"+
                           "Rekursive Summenfunktion: \t\tErgebnis: "+sumRek+"\t\tDauer: "+timeSumRek+" nanoseconds\n"+
                           "Endrekursive Summenfunktion: \t\tErgebnis: "+sumEndRek+"\t\tDauer: "+timeSumEndRek+" nanoseconds\n");


        System.out.println("Potenzfunktionen\n====================");
        System.out.println("Iterative Potenzfunktion: \t\tErgebnis: "+hochIter+"\t\tDauer: "+timeHochIter+" nanosecond\n"+
                           "Rekursive Potenzfunktion: \t\tErgebnis: "+hochRek+"\t\tDauer: "+timeHochRek+" nanoseconds\n"+
                           "Endrekursive Potenzfunktion: \t\tErgebnis: "+hochEndRek+"\t\tDauer: "+timeHochEndRek+" nanoseconds\n");





        


        
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