package threads;
import java.util.concurrent.atomic.AtomicInteger;

public class CompteurOccurenceThread extends Thread {
    private final String txt;
    private final char c;
    public AtomicInteger nbOccur = new AtomicInteger(0);

    public CompteurOccurenceThread(String texte, char recherche)
    {
        txt = texte;
        c = recherche;
    }

    public void increment() {
        nbOccur.incrementAndGet();
    }

    public void compter(String texte, char recherche) {
        for (int i = 0; i < texte.length(); i++) {
            if (recherche == texte.toLowerCase().charAt(i))
            {
                this.increment();
            }
        }
    }

    @Override
    public void run()
    {
        compter(txt, c);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
