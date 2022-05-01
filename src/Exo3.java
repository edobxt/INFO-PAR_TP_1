import threads.*;

/*
# Exercice 3 : Vers le multi-threading
Ecrire un programme qui crée et lance deux Threads en parallèle
- Le premier affichera les 26 lettres de l’alphabet
- Le second affichera les nombres de 1 à 26

Que constatez-vous ?
Quelle solution peut-on mettre en œuvre pour synchroniser les threads ?
*/

public class Exo3 {
    public static void main(String[] args) {
        AfficherAlphabetThread alphabet = new AfficherAlphabetThread(1000);
        AfficherNombresThread afficheNombre = new AfficherNombresThread(26, 1000);

        alphabet.start();
        afficheNombre.start();
    }
}
