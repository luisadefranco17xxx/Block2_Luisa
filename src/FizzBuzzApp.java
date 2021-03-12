import java.util.Arrays;

public class FizzBuzzApp {
    public static void main(String[] args) {

        int[] arr = {
                3, 5, 15, 34,
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

        for (int i=0; i<arr.length; i++) {
            System.out.println(writeFizzBuzz(arr[i]));
            System.out.println();
        }
        String[] my_resultString = new String[100];
        my_resultString=saveResult();   //the method saveResult saves the result in a string:my_resultString

        printMyResultString(my_resultString);

    }


    public static String writeFizzBuzz(int value){
        String  stringToPrint;
        stringToPrint = " ";

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

    public static String[] saveResult() {      //This methods saves the result of wirteFizzBuss in a string
        String[] resultArray = new String[100];
        for (int i=0; i<100;i++) {
            resultArray[i]= writeFizzBuzz(i);
        }
        return resultArray;
    }

    public static void printMyResultString(String[] my_string) {     //This method prints the result for 1 bis 100 in the screen

        for (int i = 0; i < 100; i++) {
            System.out.print(my_string[i]+", ");
        }
        System.out.println();
        System.out.println("second way to print:");
        System.out.println(Arrays.deepToString(my_string));
    }
}
