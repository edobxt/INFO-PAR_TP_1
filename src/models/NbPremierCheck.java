package models;

public class NbPremierCheck {
    public NbPremierCheck() {}

    public boolean estPremier(int n) {
        boolean estPremier = true;
        if (n < 0) {
            estPremier = false;
        } else if (n != 0 && n != 1) {
            for (int i = 2; i <= n/2; i++) {
                if (n != i && n % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }
        return estPremier;
    }
}
