public class NummerFactorsDemoAppo {

    public static void main(String[] args) {
       int resultDivivsors = findDivisors(110);
        System.out.println("print"+ resultDivivsors);

        System.out.println("prim?"+primNummerFind(99961));
        System.out.println("prim?"+primNummerFind(906847));
        System.out.println("prim?"+primNummerFind(999983));
        System.out.println("prim?"+primNummerFind(1991999993));
        //findPrimNummer(1234);
        int checkNummer =2;
        while (checkNummer<=1234){
            if (primNummerFind(checkNummer)){
                System.out.println(","+checkNummer);
            }
            checkNummer++;
        }

    }
    /*
    methode soll alle mögliche Teiler ausgeben, und due Anzahl der Teile returnieren
     */
 /*   public static int findDivisors (int nummer){
       int counter =1;
       int countPossibleDivisors =0;
       while (counter<nummer) {
           if (nummer%counter==0) {
               System.out.println(counter + ",");
               countPossibleDivisors++;
           }
           counter++;
       }
    return countPossibleDivisors;
    }
*/
       public static int findDivisors (int nummer){
           System.out.println("list of divisors f nummer: "+ nummer);
       int countPossibleDivisors =0;
       for (int counter=1; counter<nummer; counter++) {
           if (nummer%counter==0) {
               System.out.println(counter + ",");
               countPossibleDivisors++;
           }
       }
    return countPossibleDivisors;
    }

    public static boolean primNummerFind(int value)  {
        int i=2;
      //  while (i<value){
        while (i<Math.sqrt(value)){
            if (value%i==0){
                return false;
            }
            i++;
        }
        System.out.println("ich bin in primNummerFind");
        return true;
    }
   /* public static int findPrimNummer(int value ){
        int i=2;
        while (i<value) {

            if (primNummerFind(i)) {
                if (value % i==0) {
                    System.out.println("factor:" + i);
                }
            }
        }
    }*/
}
