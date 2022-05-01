
/*
# Exercice 5 : Du séquentiel au parallèle
1. Ecrire un programme séquentiel qui demande à l’utilisateur de saisir un nombre N, le
programme crée ensuite une liste contenant tous les nombres premiers inférieurs à N
2. Proposer une version parallélisée de ce programme.
Vous discuterez de la stratégie avec l’enseignant avant l’implémentation.
3. Comparer les temps de calculs avec différentes valeurs de N pour ces 2 programmes.
*/

import models.NbPremierCheck;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Exo5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NbPremierCheck nbPremierCheck = new NbPremierCheck();

        //System.out.println("Veuillez entrer un entier : ");
        //int n = in.nextInt();
        int n = 10000;
        System.out.println("Liste des nombres premiers inferieurs a " + n);

        Instant start = Instant.now();

        for (int i = 1; i <= n; i++) {
            if (nbPremierCheck.estPremier(i))
                System.out.println(i);
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis() + " ms de calcul sequentiel pour " + n + " nombres");
    }
}
