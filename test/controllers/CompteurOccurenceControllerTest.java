package controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompteurOccurenceControllerTest {
    CompteurOccurenceController coc1Thread = new CompteurOccurenceController(1);
    CompteurOccurenceController coc2Thread = new CompteurOccurenceController(2);
    CompteurOccurenceController coc5Thread = new CompteurOccurenceController(5);

    String texte = "jonathan";

    @Test
    void CheckAucuneOccurence1Thread() throws InterruptedException {
        assertEquals(0, coc1Thread.getNbOccurence(texte, 'e'));
    }

    @Test
    void CheckPlusieursOccurence1Thread() throws InterruptedException {
        assertEquals(2, coc1Thread.getNbOccurence(texte, 'a'));
    }

    @Test
    void CheckAucuneOccurenceNbThreadPaire() throws InterruptedException {
        assertEquals(0, coc2Thread.getNbOccurence(texte, 'e'));
    }

    @Test
    void CheckPlusieursOccurenceNbThreadPaire() throws InterruptedException {
        assertEquals(2, coc2Thread.getNbOccurence(texte, 'a'));
    }

    @Test
    void CheckAucuneOccurenceNbThreadImpaire() throws InterruptedException {
        assertEquals(0, coc5Thread.getNbOccurence(texte, 'e'));
    }

    @Test
    void CheckPlusieursOccurenceNbThreadImpaire() throws InterruptedException {
        assertEquals(2, coc5Thread.getNbOccurence(texte, 'a'));
    }
}