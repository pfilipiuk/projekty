package figures;

public class Utility {

    static void showResults(double areaSum, double perimeterSum) {
        System.out.println("Suma pól powierzchni figur: " + Math.round(areaSum * 100.0) / 100.0);
        System.out.println("Suma obwodów figur: " + Math.round(perimeterSum * 100.0) / 100.0 + "\n");
    }

}
