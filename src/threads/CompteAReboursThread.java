package threads;

public class CompteAReboursThread extends Thread {
    private final int nb;

    public CompteAReboursThread(int n) { nb = n; }

    public void run() {
        System.out.println("Compte a rebours de " + nb + " secondes");

        for (int i = nb; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Fin du compte a rebours de " + nb + " secondes");
    }
}
