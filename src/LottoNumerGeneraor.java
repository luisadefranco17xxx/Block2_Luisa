import java.util.Random;

public class LottoNumerGeneraor {

    public static void main(String[] args) {

        System.out.println("Unser Quicktipps");

        // Verschachtelung von Schleifen
        for (int tipps = 0; tipps < 5; tipps++) {
            System.out.print("Nr. " + tipps + ": ");
            int[] arr = createOneTipp();

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    public static int[] createOneTipp(){
        int[] oneTipp = new int[6]; // 1.

        //  for(startwert; bedingung;inkrement)
        for (int i = 0; i < oneTipp.length; i++) {
            oneTipp[i] = generateOneNumber(45) ; // 2.
        }

        return oneTipp; // 3.
    }

    public static int generateOneNumber(int range){
        Random random = new Random();
        int randValue = random.nextInt();
        if (randValue < 0) {
            randValue = randValue * -1;
        }

        int value = (randValue % range) + 1;

        return value;
    }
}
/*import java.util.Random;

public class LottoNumerGeneraor {
    public static void main(String[] args) {

        System.out.println("Unsere quick Tipps");


        int count=0;
        count=49;
        for (int j=0; j<3; j++) {
            createOneTipp();

            //wir speicher den int[]
            //print
        }

    }


    public static void createOneTipp(){
        int[] intArray = new int[6];
        int j=0;
        for (int i=0; i<6; i++) {
            //System.out.print(generatorNummer(45)+", ");
            intArray[i]=generatorNummer(45);
            while (j<i) {
                if (intArray[j]==intArray[i]) {
                    intArray[i]=generatorNummer(45);
                }
                j++;
            }
            j=0;
        }
        System.out.println("Array List");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println();


    }

    public static int  generatorNummer (int count){
        Random random= new Random();

        int value = random.nextInt();
        if (value <0) {
            value = value*-1;
        }
        value = value% count + 1 ;

        return value;
    }


}
*/