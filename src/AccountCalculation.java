public class AccountCalculation {
    public static void main(String[] args) {
  //      calculateInterest(1000, (float)1.5,10);
    }
    public static void calculateInterest(float startCapital,float interest, int jahrNummer) {
        float Capital = startCapital;
        for(int i=1;i<=jahrNummer;i++) {
     //       Capital = (Capital +interest/100.0);
            String niceValueStart = String.format("%.2f",Capital);
            System.out.println("End of Jahr"+i+"capital ist "+startCapital+". Am ende Jahr ist: " +Capital );

            startCapital=Capital;
        }
    }

}


/*
 * Write a methode, which calculates the interests to a account.
 * The method takes startCapital, rates, count of years
 * The methode should calculate the capital after the count of rates
 * For every year, it should also print a line to console
 *
 * Example:
 *   startCapital: 1000.0
 *   rates: 1.5 %
 *   years: 10
 *
 *   Output
 *   End of 1 year: 1000.0 -> 1015.0
 *   End of 2 year: 1015.0 -> 1030,225
 *   ....
 *
 *   Total: 1160,54
 *
 * */