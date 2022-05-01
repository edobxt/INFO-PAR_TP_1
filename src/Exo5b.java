import controllers.CheckNombresPremiersController;

import java.time.Duration;
import java.time.Instant;

public class Exo5b {
    public static void main(String[] args) {
        int n = 10000;
        int nbThread = 4;

        Instant start = Instant.now();

        CheckNombresPremiersController cnpc = new CheckNombresPremiersController(nbThread);
        cnpc.verifNbPremiers(n);

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(duration.toMillis() + " ms de calcul parallele pour " + n + " nombres");
    }
}
