import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PruefungsverwaltungTest {
    Pruefungsverwaltung pruef = new Pruefungsverwaltung();
    ZufaelligeNotengebung zuef= new ZufaelligeNotengebung();

    @Test
    void testNichtrunden(){
        assertEquals(2.0 , pruef.rundeAufHalbeNote(2.0));
    }

    @Test
    void testNichtrunden2(){
        assertEquals(2.5, pruef.rundeAufHalbeNote(2.5));
    }

    @Test
    void testAbrundenAufGanze(){
        assertEquals(2.0, pruef.rundeAufHalbeNote(2.24));
    }

    @Test
    void testHalbrunden(){
        assertEquals(2.5, pruef.rundeAufHalbeNote(2.25));
    }

    @Test
    void testAbrundenAufHalbe(){
        assertEquals(2.5, pruef.rundeAufHalbeNote(2.74));
    }
    @Test
    void testrundenAufGanze(){
        assertEquals(3.0, pruef.rundeAufHalbeNote(2.75));
    }

    @Test
    void testGeneriereZahl(){
        double x = zuef.generiereZufaelligePruefungsnote();
        assertTrue(x <= 6 && x >= 1);
    }

}