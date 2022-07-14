import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read {

    private static ArrayList<String> readLines(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
        }
        return lines;
    }

    public static List<Person> readPeople(String path) throws FileNotFoundException {
        ArrayList<String> lines = readLines(path);
        ArrayList<Person> people = new ArrayList<>();

        for (String line : lines) {
            String[] splitLine = line.split(";");
            people.add(new Person(splitLine[0], splitLine[1], Integer.parseInt(splitLine[2]),
                    Float.parseFloat(splitLine[3])));
        }
        return people;
    }
}
