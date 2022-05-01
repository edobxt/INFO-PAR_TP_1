package controllers;

import threads.VerifNombrePremierThread;

public class CheckNombresPremiersController {
    public final int nbThread;

    public CheckNombresPremiersController(int nbThread) {
        this.nbThread = nbThread;
    }

    public void verifNbPremiers(int n) {
        int start = 0;
        for (int i = 0; i < nbThread; i++) {
            int end = ((i+1)*n)/nbThread;
            VerifNombrePremierThread vnbt = new VerifNombrePremierThread(start, end);
            vnbt.start();
            start = end;
        }
    }
}
