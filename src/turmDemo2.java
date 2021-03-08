public class turmDemo2 {
    public static void main(String[] args) {

        turmCalc(202103);

    }
    public static void turmCalc (long value){

        for(int i=2;i<10;i++) {
            System.out.println("Value "+value+"|*"+i);
            value=value*i;
        }
        for(int i=2;i<10;i++) {
            System.out.println("Value "+value+"|:"+i);
            value=value/i;
        }
        System.out.println("Value "+value+" ");
    }
}
