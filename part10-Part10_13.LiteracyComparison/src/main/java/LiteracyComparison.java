
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Infos> infos = new ArrayList();
        try {
            Files.lines(Paths.get("literacy.csv")).map(row -> row.split(",")).forEach(parts -> infos.add(new Infos(parts[3], Integer.valueOf(parts[4]), parts[2].split(" ")[1], Double.valueOf(parts[5]))));
        } catch (IOException ex) {
            System.out.println("Error :" + ex.getMessage());
        }
        infos.sort((a,b)->a.compareTo(b));
        for (Infos i : infos) {
            i.printInfos();
        }

    }
}
