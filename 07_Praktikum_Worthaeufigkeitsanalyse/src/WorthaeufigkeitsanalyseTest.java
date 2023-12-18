import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorthaeufigkeitsanalyseTest {

    Worthaeufigkeitsanalyse wort = new Worthaeufigkeitsanalyse();

    @Test
    void checkSatzzeichen(){
        assertEquals("Juvan", wort.entferneSatzzeichen("!Juvan;"));
    }

    @Test
    void checkAnfangsZeichen(){
        assertEquals("Michael", wort.entferneSatzzeichen("?Michael"));
        assertNotEquals("?Michael", wort.entferneSatzzeichen("?Michael"));
    }

    @Test
    void checkSchlussZeichen(){
        assertEquals("Juvan", wort.entferneSatzzeichen("Juvan!"));
        assertNotEquals("Juvan!", wort.entferneSatzzeichen("Juvan!"));
    }

    @Test
    void checkMitteZeichen(){
        assertEquals("Ich war in C&A", wort.entferneSatzzeichen("Ich war in C&A"));
    }

    @Test
    void checkVerarbeitung(){
        wort.verarbeiteText("Ich heisse Juvan und Juvan");
        assertEquals(wort.getWoerterHaeufigkeit().get("ich"), 1);
        assertEquals(wort.getWoerterHaeufigkeit().get("heisse"), 1);
        assertEquals(wort.getWoerterHaeufigkeit().get("juvan"), 2);
        assertEquals(wort.getWoerterHaeufigkeit().get("und"), 1);
    }
}