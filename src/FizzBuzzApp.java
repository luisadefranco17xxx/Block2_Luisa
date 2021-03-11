public class FizzBuzzApp {
    public static void main(String[] args) {

        int[] arr = {
               3,5,15, 34 };
               /*98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };*/

        for (int i=0; i<arr.length; i++) {
            System.out.println(writeFizzBuzz(arr[i]));
        }
    }


    public static String writeFizzBuzz(int value){
        String  stringToPrint;
        stringToPrint = " ";

        System.out.println();
        if (value%3==0){
            stringToPrint="Frizz";
        }
        if (value%5==0){
            stringToPrint=stringToPrint+"Buzz";
        }
        if (!((value%3==0)||(value%5==0))) {
            stringToPrint = String.valueOf(value);
        }

        return stringToPrint;
    }
}
