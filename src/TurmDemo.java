public class TurmDemo {
    public static void main(String[] args) {

        turmRechnen(23);
        turmRechnen(12544);
        turmRechnen(6);
        turmRechnen(4);
    }

    public static void turmRechnen (double value) {
        int i=1;
        while (i<10) {
            value=value *i;
            System.out.println(value);
            i++;
        }
        i=2;
        while (i<10) {
            value = value/i;
            System.out.println(value);
            i++;
        }

    }
}
