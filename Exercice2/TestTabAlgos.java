package mypackage;

import static org.junit.jupiter.api.Assertions.assertEquals; // import pour la méthode statique assertEquals
import static org.junit.jupiter.api.Assertions.fail; //import pour la méthode statique fail
import static org.junit.jupiter.api.Assertions.assertTrue; //import pour la méthode statique assertTrue
import org.junit.jupiter.api.Test; // import pour l'annotation @Test indiquant qu'il s'agit d'une méthode de test

/**
 *
 * @author E. Date GBIKPI BENISSANH
 */
@SuppressWarnings("PMD.EmptyCatchBlock")
public final class TestTabAlgos {

    /**
     * Détermine la valeur la plus grande d'un tableau.
     */
    @Test
    public void testplusGrand() {
        final int[] tab = new int[]{5, 52, 99, 8, 20, 87, 23};
        final int expectedValue = 99;
        assertEquals(expectedValue, TabAlgosUtils.plusGrand(tab));
    }

    /**
     * Calcule la moyenne des valeurs du tableau.
     *
     */
    @Test
    public void testMoyenne() {
        final int[] tab1 = new int[]{5, 52, 99, 8, 20, 87, 23};
        final int expectedValue = 42;
        assertEquals(expectedValue, TabAlgosUtils.moyenne(tab1));
    }

    /**
     * Calcule la moyenne des valeurs du tableau en levant une exception.
     *
     */
    @Test
    public void testMoyenneAvecException() {
        int[] tab2 = null;
        try {
            assertEquals(0, TabAlgosUtils.moyenne(tab2));
            fail("Exception levé pour le tableau sans paramètre.");
        } catch (IllegalArgumentException e) {
            // This is expected
        }
    }

    /**
     * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
     *
     */
    @Test
    public void testEgaux() {
        final int[] tab3 = new int[]{5, 2, 7, 8, 10, 24, 23};
        final int[] tab4 = new int[]{5, 2, 7, 8, 10, 24, 23};
        assertTrue(TabAlgosUtils.egaux(tab3, tab4));
    }

    /**
     * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
     *
     */
    @Test
    public void testSimilaires() {
        final int[] tab5 = new int[]{5, 2, 7, 8, 10, 24, 23};
        final int[] tab6 = new int[]{10, 24, 23, 5, 8, 2, 7};
        assertTrue(TabAlgosUtils.similaires(tab5, tab6));
    }
}
