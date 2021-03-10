public class AccountCalculation {

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


    public static void main(String[] args) {

        double result = calcInterests(1000, 1.5, 10);
        System.out.println("result = " + result);
    }

    public static double calcInterests(double startCapital, double rates, int years) {
        for(int i = 1; i <= years;i++){
            double calc = calcInterestOneYear(startCapital, rates);

            String niceValueStartCapital = String.format("%.2f", startCapital);
            String niceValueCalc = String.format("%.2f", calc);

            System.out.println("End of " + i + " year: " + niceValueStartCapital + " -> " + niceValueCalc );
            startCapital = calc;
        }
        return startCapital;
    }

    public static double calcInterestOneYear(double startCapital, double rates){
        return startCapital * (1 + rates / 100.0);
    }
}