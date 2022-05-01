package threads;

public class AfficherAlphabetThread extends Thread {
    private final int sleep;

    public AfficherAlphabetThread(int sleepTime) {
        sleep = sleepTime;
    }

    public void run() {
        for (char lettre = 'a'; lettre <= 'z'; lettre++)
        {
            System.out.println(lettre);

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
