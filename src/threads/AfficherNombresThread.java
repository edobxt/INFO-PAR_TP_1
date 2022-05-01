package threads;

public class AfficherNombresThread extends Thread {
    private final int nb;
    private final int sleep;

    public AfficherNombresThread(int n, int sleepTime)
    {
        nb = n;
        sleep = sleepTime;
    }

    public void run()
    {
        for (int i = 1; i <= nb; i++) {
            System.out.println(i);

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
