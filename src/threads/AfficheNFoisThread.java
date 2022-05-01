package threads;

public class AfficheNFoisThread extends Thread {
    private final int nb;
    private final String message;

    public AfficheNFoisThread(int n, String m) {
        nb = n;
        message = m;
    }

    public void run() {
        for (int i = 0; i < nb; i++) {
            System.out.println(message);
        }
    }
}
