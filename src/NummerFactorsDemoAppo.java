public class NummerFactorsDemoAppo {

    public static void main(String[] args) {
       int resultDivivsors = findDivisors(110);
        System.out.println("print"+ resultDivivsors);
    }
    /*
    methode soll alle mögliche Teiler ausgeben, und due Anzahl der Teile returnieren
     */
    public static int findDivisors (int nummer){
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

}
