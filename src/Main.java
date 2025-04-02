import java.io.File;
import java.util.*;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        List<Persoana> persoane = citireFisier("Persoana");
        afisare(persoane);
        afisareFisier(persoane,"output.txt");
    }



    private static List<Persoana> citireFisier(String filePath) {
        List<Persoana> persoane = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String nume = scanner.next();
                String prenume = scanner.next();
                int varsta = scanner.nextInt();
                persoane.add(new Persoana(nume, prenume, varsta));
            }
            scanner.close();


            persoane.sort(Comparator.comparing(p ->p.nume));
        } catch (Exception e) {
            System.out.println("Eroare la citire: " + e.getMessage());
        }
        return persoane;
    }
    private static void afisare(List<Persoana> persoane) {
        for (Persoana p : persoane) {
            System.out.println(p+" ");
        }
    }

    private static void afisareFisier(List<Persoana> persoane, String file) {
        try {
            PrintWriter writer = new PrintWriter("output.txt");
            for (Persoana p : persoane) {
                writer.println(p);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Eroare la scriere");
        }
    }
}
