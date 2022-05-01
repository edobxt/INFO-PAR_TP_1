package threads;

import models.NbPremierCheck;

public class VerifNombrePremierThread extends Thread {
    private final int start;
    private final int end;
    private final NbPremierCheck nbPremierCheck = new NbPremierCheck();

    public VerifNombrePremierThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            if (nbPremierCheck.estPremier(i))
                System.out.println(i);
        }
    }
}
