public class NotenDemo {
    public static void main(String[] args) {

        getNotenText(50);
        getNotenText(99);
        getNotenText(22);

    }

    public static String getNotenText (int punkte) {
        String textNote;
        if (punkte >=90) {
            textNote = "Sehr gut";
        } else if (punkte >=78 && punkte <=89){
            textNote = "gut";
        } else if  (punkte >=65 && punkte <=77) {
            textNote = "befriedigend";
        } else if (punkte >=51 && punkte <=64) {
            textNote = "genügend";
        } else  {
            textNote = "ungenügend";
        }

        System.out.println(textNote);
        return textNote;
    }
}
