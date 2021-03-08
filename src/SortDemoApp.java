import java.util.Arrays;

public class SortDemoApp {
    public static void main(String[] args) {
       int[] arr = new int[7];
        arr[0] =9;
        arr[1] =81;
        arr[2] =7;
        arr[3] =58;
        arr[4] =0;
        arr[5] =2;
        arr[6] =3;


        arrangeOrder(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));    //

    }

    public static void  arrangeOrder (int[] numbers){
        System.out.println("length= " + numbers.length);
        int j=1;
        int i=1;
        while (i< numbers.length) {
            while (j < numbers.length) {
                if ( numbers[j - 1]>numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
                j++;
            }
            j=1;
            i++;
        }

    }

}
