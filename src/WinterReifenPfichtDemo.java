public class WinterReifenPfichtDemo {
    public static void main(String[] args) {

        isWinterreifenPflicht(10, false);
        isWinterreifenPflicht(3,false);
        isWinterreifenPflicht(5,true);
        isWinterreifenPflicht(44,true);
        isWinterreifenPflicht(6,true);
    }

    public static void isWinterreifenPflicht(int temperature, boolean rutschigeFahrbahn) {
        if (temperature>10) {                   // temp>10 keine Pflicht
            System.out.println("Keine Pficht");
        }  else if (temperature >=4 && !rutschigeFahrbahn) {
            System.out.println("Keine Pficht");
        }  else {
            System.out.println("Winterrefen Pficht!");
        }

    }
}
