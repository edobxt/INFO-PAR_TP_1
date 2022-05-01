package controllers;

import threads.CompteurOccurenceThread;

public class CompteurOccurenceController {
    private final int nbThread;

    public CompteurOccurenceController(int nbThread) {
        this.nbThread = nbThread;
    }

    public int getNbOccurence(String texte, char recherche) throws InterruptedException {
        int n = texte.length();
        int start = 0;
        int nbOccur = 0;

        for (int i = 0; i < nbThread; i++) {
            int end = ((i+1)*n)/nbThread;
            String string_coupe = texte.substring(start, end);
            start = end;

            CompteurOccurenceThread compteurOccurence = new CompteurOccurenceThread(string_coupe, recherche);
            compteurOccurence.start();
            compteurOccurence.join(10);

            nbOccur += compteurOccurence.nbOccur.get();
        }
        return nbOccur;
    }

}
