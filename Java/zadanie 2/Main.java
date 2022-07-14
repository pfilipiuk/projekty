import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner userScanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku: ");
        String fileName = userScanner.next();
        List<Person> people = Read.readPeople(fileName + ".txt");

        List<String> outputNames = new ArrayList<>();
        List<String> outputLastnames = new ArrayList<>();
        List<Integer> outputAges = new ArrayList<>();
        float maxEfficacy = 0;

        for (Person person : people) {

            if (person.getEfficacy() > maxEfficacy) {
                outputNames.clear();
                outputLastnames.clear();
                outputAges.clear();
                maxEfficacy = person.getEfficacy();
            }
            if ((person.getName().length() > 3) && (person.getLastName().endsWith("ski"))
                    && (person.getEfficacy() >= maxEfficacy)) {

                outputNames.add(person.getName());
                outputLastnames.add(person.getLastName());
                outputAges.add(person.getAge());
                maxEfficacy = person.getEfficacy();
            }
        }

        for (int i = 0; i < outputLastnames.size(); i++) {
            BuildString.anonymize(outputNames.get(i));
            BuildString.anonymize(outputLastnames.get(i));
        }

        PrintWriter printWriter = new PrintWriter(fileName + "_max.txt");
        if (outputNames.isEmpty()) {
            printWriter.println("");
        } else {
            for (int i = 0; i < outputLastnames.size(); i++) {
                StringBuilder anonName = BuildString.anonymize(outputNames.get(i));
                StringBuilder anonLastname = BuildString.anonymize(outputLastnames.get(i));
                printWriter.println(anonName + " " + anonLastname + " " + outputAges.get(i));
            }
        }
        printWriter.close();
    }
}