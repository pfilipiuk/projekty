package figures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static figures.Utility.showResults;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(2);
            switch (number) {
                case 0:
                    int x = random.nextInt(20) - 10;
                    int y = random.nextInt(20) - 10;
                    int radius = random.nextInt(10) + 1;
                    Figure circle = new Circle(x, y, radius);
                    figures.add(circle);
                    break;
                case 1:
                    x = random.nextInt(20) - 10;
                    y = random.nextInt(20) - 10;
                    int side = random.nextInt(10) + 1;
                    Figure square = new Square(x, y, side);
                    figures.add(square);
                    break;
            }
        }
        double areaSum = 0.0;
        double perimeterSum = 0.0;

        System.out.println("WYLOSOWANE FIGURY\n");

        for (Figure figure : figures) {
            System.out.println(figure);
            areaSum += figure.area();
            perimeterSum += figure.perimeter();
        }
        showResults(areaSum, perimeterSum);

        areaSum = 0.0;
        perimeterSum = 0.0;

        System.out.println("PRZESUWANIE FIGUR O WEKTOR [5, 6]\n");

        for (Figure figure : figures) {
            figure.move(5, 6);
            System.out.println(figure);
            areaSum += figure.area();
            perimeterSum += figure.perimeter();
        }
        showResults(areaSum, perimeterSum);

        areaSum = 0.0;
        perimeterSum = 0.0;

        System.out.println("SKALOWANIE FIGUR DWUKROTNIE\n");

        for (Figure figure : figures) {
            figure.scale(2);
            System.out.println(figure);
            areaSum += figure.area();
            perimeterSum += figure.perimeter();
        }
        showResults(areaSum, perimeterSum);
    }
}
