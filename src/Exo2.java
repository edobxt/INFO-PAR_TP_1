import java.util.Scanner;
import threads.CompteAReboursThread;

/*
# Exercice 2 : Compte à rebours
Ecrire un programme qui demande à l’utilisateur de saisir un entier N.
Le programme crée ensuite un Thread qui affiche un compte à rebours de N à 0.
*/

public class Exo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Veuillez entrer un entier N : ");
        int n = in.nextInt();

        CompteAReboursThread car1 = new CompteAReboursThread(n);
        CompteAReboursThread car2 = new CompteAReboursThread(n*2);

        car1.start();
        car2.start();
    }
}
