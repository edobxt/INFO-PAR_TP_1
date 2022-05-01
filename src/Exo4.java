import controllers.*;

/*
# Exercice 4 : Quand la ressource est partagée
On souhaite mettre en place un programme qui décompte le nombre d’occurrences
d’un caractère c dans une longue chaine de caractères.

1. Proposer, sous forme de diagramme, une solution pour dénombrer de façon parallèle
le nombre d’occurrence de c dans la chaine.
2. Implémenter la solution
*/

public class Exo4 {
    public static void main(String[] args) throws InterruptedException {
        String texte = "jonathan";
        char recherche = 'a';

        CompteurOccurenceController coc1 = new CompteurOccurenceController(4);
        int nbOccurence1 = coc1.getNbOccurence(texte, recherche);

        System.out.println("Nb occurence de '" + recherche + "' dans " + "'"
                + texte + "' : " + nbOccurence1);
    }
}
