public class FizzBuzzApp {
    public static void main(String[] args) {

        int[] arr = {
               3,5,15,
               98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

        for (int i=0; i<arr.length; i++) {
            writeFizzBuzz(arr[i]);
            System.out.println("Number "+arr[i]+ ", the divisors are " +writeFizzBuzz(arr[i]));


        }
    }


    public static String writeFizzBuzz(int value){
        String  stringToPrint;
        stringToPrint = " ";

        System.out.println();
        if (value%3==0){
                //stringToPrint.concat("Frizz");
            System.out.print("Frizz");
            stringToPrint="Frizz";
            //System.out.print(stringToPrint);
        }
        if (value%5==0){
           //stringToPrint.concat("Buzz");
            stringToPrint=stringToPrint+"Buzz";

            System.out.print("Buzz");
        } else if (!(value%3==0)) {
            stringToPrint=" ";
            System.out.println(value);
            //return value.toString();
            //soll value zurück geben
        }

        System.out.println();
        return stringToPrint;
    }
}
