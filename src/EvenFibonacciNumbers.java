public class EvenFibonacciNumbers {
    public static void main(String[] args) {

        printEvenFibonacci();
    }
    public static void printEvenFibonacci() {

        int i =0;
        double precedingPreviusTerm =1;
        double previousTerm=1;
        double somme;

        while (i<2000) {
            somme=previousTerm+precedingPreviusTerm;
            if (somme%2==0) {
                System.out.println("value i is: "+i+" the somme ist: " + somme);
            }
            i++;
            precedingPreviusTerm=previousTerm;
            previousTerm=somme;
        }

    }
}
