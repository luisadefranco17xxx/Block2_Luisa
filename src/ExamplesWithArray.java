
public class ExamplesWithArray {
    public static void main(String[] args) {


        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8   };

        System.out.println("arr.length = " + arr.length);
        System.out.println(findSmallestNummer(arr));
        System.out.println(findBiggestNummer(arr));
        System.out.println(findSumAllNummer(arr));
        System.out.println(findAverageAllNummer(arr));
        System.out.println(findDuplicatedNummer(arr).toString());
    }

    // TODO 1: Write a method, finding and returning the smallest number
    // TODO 2: Write a method, finding and returning the biggest number
    // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
    // TODO 4: Write a method, calculating and returning the average over all numbers
    // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

    public static int findSmallestNummer (int[] arr) {
            int keep =arr[0];
            for (int i=0; i<arr.length; i++) {
                if (arr[i] <keep) {
                    keep = arr[i];
                }

            }
        return keep;
    }

    public static int findBiggestNummer (int[] arr) {
        int keep =arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >keep) {
                keep = arr[i];
            }

        }
        return keep;
    }

    public static int findSumAllNummer (int[] arr) {
        int summ =0;
        for (int i=0; i<arr.length; i++) {
                summ = summ + arr[i];
        }
        return summ;
    }

    public static int findAverageAllNummer (int[] arr) {
        int summ =findSumAllNummer(arr);
        int average=summ/arr.length;
        return average;
    }

    public static int[] findDuplicatedNummer (int[] arr) {
        int[] intArrayTmp = new int[arr.length];
        int count=0;

        for (int j=0; j<arr.length; j++) {
            int keep =arr[j];
            for (int i=j+1; i<arr.length; i++) {
                if (arr[i] ==keep ) {
                    intArrayTmp [count] = arr[i];
                    System.out.println("duplicated nummer: "+ arr[i] );
                    count++;
                }
            }
         }
        //System.out.println(intArrayTmp.toString());  // ich kann nicht in intArrayTemp etwas kopieren
        return intArrayTmp;
    }

}