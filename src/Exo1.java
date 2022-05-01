import threads.AfficheNFoisThread;

import java.util.Scanner;

/*
# Exercice 1 : Premier Thread
Ecrire un programme qui demande à l’utilisateur de saisir un entier N.
Le programme crée ensuite un Thread qui affiche N fois le message "Bonjour".
*/

public class Exo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Veuillez entrer un entier N :");

        int n = in.nextInt();
        AfficheNFoisThread a1 = new AfficheNFoisThread(n, "Bonjour");
        a1.start();
    }
}
